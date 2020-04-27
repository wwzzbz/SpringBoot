package com.bat.wz.common.utils;

import io.jsonwebtoken.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Classname JwtTokenUtil
 * @Description TODO
 * @Date 2020/4/24 14:54
 * @Created by wz
 */
@Component
public class JwtTokenUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger(JwtTokenUtil.class);
    private static final String CLAIM_KEY_USERNAME = "sub";
    private static final String CLAIM_KEY_CREATED = "created";
    @Value("${jwt.secret}")
    private String secret;
    @Value("${jwt.expiration}")
    private Long expiration;

    /**
     * 根据负载生成token
     * JWT token的格式：header.payload.signature
     *
     * header中用于存放签名的生成算法
     * {"alg": "HS512"}
     *
     * payload中用于存放用户名、token的生成时间和过期时间
     * {"sub":"admin","created":1489079981393,"exp":1489684781}
     *
     * signature为以header和payload生成的签名，一旦header和payload被篡改，验证将失败
     * //secret为加密算法的密钥
     * String signature = HMACSHA512(base64UrlEncode(header) + "." +base64UrlEncode(payload),secret)
     * @param claims
     * @return
     */
    private String generateToken(Map<String ,Object> claims){
        return Jwts.builder().setClaims(claims).setExpiration(generateExpirationDate())
                .signWith(SignatureAlgorithm.HS512,secret).compact();
    }

    /**
     * 从tokent中获取jwt负载
     * @param token
     * @return
     */
    private Claims getClaimsFromToken(String token){
        Claims claims = null;
        try {
            claims = Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.info("jwt格式验证失败{}"+token);
        }
        return claims;
    }

    /**
     * 生成tokent过期日期
     * @return
     */
    private Date generateExpirationDate() {
        return new Date(System.currentTimeMillis()+expiration*1000);
    }

    /**
     * 从tokent中获取登录用户名
     * @param token
     * @return
     */
    public String getUsernameFromToken(String token){
        String username = null;
        try {
            Claims claims = getClaimsFromToken(token);
            username = claims.getSubject();
        } catch (Exception e) {
            e.printStackTrace();
            username = null;
        }
        return username;
    }

    /**
     * 验证token是否还有效
     * @param token
     * @param userDetails
     * @return
     */
    public boolean valildToken(String token, UserDetails userDetails){
        String username = getUsernameFromToken(token);
        return (username.equals(userDetails.getUsername())) && !isTokenExpired(token);
    }

    /**
     * 验证token是否已过期
     * @param token
     * @return
     */
    private boolean isTokenExpired(String token) {
        Date expirDate = getExpiredDateFromToken(token);
        return expirDate.before(new Date());
    }

    /**
     * 从token中获取过期时间
     * @param token
     * @return
     */
    private Date getExpiredDateFromToken(String token) {
        Claims claims = getClaimsFromToken(token);
        Date date = claims.getExpiration();
        return date;
    }
    /**
     *根据用户信息生成token
     */
    public String generateToken(UserDetails userDetails){
        Map<String,Object> claims = new HashMap<>();
        claims.put(CLAIM_KEY_USERNAME,userDetails.getUsername());
        claims.put(CLAIM_KEY_CREATED,new Date());
        return generateToken(claims);
    }
    /**
     * 判断token是否可以被刷新
     */
    public boolean canRefresh(String token) {
        return !isTokenExpired(token);
    }
    /**
     * 刷新token,即token中的创建时间
     */
    public String refreshToken(String token) {
        Claims claims = getClaimsFromToken(token);
        claims.put(CLAIM_KEY_CREATED, new Date());
        return generateToken(claims);
    }

}
