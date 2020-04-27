package com.bat.wz.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Classname MyBatisConfig
 * @Description mybatis配置
 * @Date 2020/4/24 11:50
 * @Created by wz
 */
@Configuration
@MapperScan("com.bat.wz.mbg.mapper")
public class MyBatisConfig {
}
