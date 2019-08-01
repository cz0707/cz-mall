package com.mall.cz.demo.config;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 */
@Configuration
@MapperScan("com.mall.cz.demo.mbg.mapper")
public class MyBatisConfig {
}
