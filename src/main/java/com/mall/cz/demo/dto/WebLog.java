package com.mall.cz.demo.dto;

import io.swagger.models.auth.In;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WebLog {
    /**
     * 操作描述
     */
    private String description;
    /**
     * 操作用户
     */
    private String username;
    /**
     * 操作时间
     */
    private Long startTime;
    /**
     * 消耗时间
     */
    private Integer spendTime;
    /**
     * 根路径
     */
    private String basePath;
    /**
     * URI
     */
    private String URI;
    /**
     * URL
     */
    private String URL;
    /**
     * 请求类型
     */
    private String method;
    /**
     * IP地址
     */
    private String IP;
    /**
     * 请求参数
     */
    private Object parameter;
    /**
     * 请求返回的结果
     */
    private Object result;
}
