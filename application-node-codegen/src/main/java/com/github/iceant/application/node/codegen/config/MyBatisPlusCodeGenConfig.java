package com.github.iceant.application.node.codegen.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(value = {MyBatisPlusCodeGenProperties.class})
public class MyBatisPlusCodeGenConfig {

    final MyBatisPlusCodeGenProperties properties;

    public MyBatisPlusCodeGenConfig(MyBatisPlusCodeGenProperties properties) {
        this.properties = properties;
    }


}
