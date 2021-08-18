package com.hjrpc.webtest.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

@ConfigurationProperties(prefix = "spring.thymeleaf")
public class ThymeleafProperties {
    public static final Charset DEFAULT_ENCODING= StandardCharsets.UTF_8;
    public static final String DEFAULT_PREFIX="classpath:/templates/";
    public static final String DEFAULT_SUFFIX=".html";
}
