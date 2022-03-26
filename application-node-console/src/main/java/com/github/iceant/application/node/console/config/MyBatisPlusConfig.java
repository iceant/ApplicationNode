package com.github.iceant.application.node.console.config;

import com.github.iceant.application.node.console.storage.mapper.TMenuMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackageClasses = {TMenuMapper.class})
public class MyBatisPlusConfig {
//    @Bean
//    public GlobalConfig globalConfig() {
//        GlobalConfig globalConfig = new GlobalConfig();
//        globalConfig.setMetaObjectHandler(new UpdateRelatedFieldsMetaHandler());
//        return globalConfig;
//    }
}
