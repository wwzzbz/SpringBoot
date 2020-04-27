package com.bat.wz.common.api;

/**
 * @Classname ResultCode
 * @Description 枚举了一些常用错误码
 * @Date 2020/4/24 11:59
 * @Created by wz
 */
public enum  ResultCode implements IErrorCode {
    SUCCESS(200,"操作成功"),
    FAILED(500,"操作失败"),
    VALIDATE_FAILED(404,"参数校验失败"),
    UNAUTHORIZED(401,"暂未登录或Token已过期"),
    FORBIDDEN(403,"没有相关权限");
    private long code ;
    private String message;
    private ResultCode(long code , String message){
        this.code = code;
        this.message = message;
    }
    @Override
    public long getCode() {
        return 0;
    }

    @Override
    public String getMessage() {
        return null;
    }

}
