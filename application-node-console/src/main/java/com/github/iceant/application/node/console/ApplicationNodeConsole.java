package com.github.iceant.application.node.console;

import com.github.iceant.application.node.console.storage.mapper.TMenuMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@MapperScan(basePackageClasses = {TMenuMapper.class})
public class ApplicationNodeConsole {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new SpringApplicationBuilder(ApplicationNodeConsole.class)
                .bannerMode(Banner.Mode.OFF)
                .run(args);
    }
}
