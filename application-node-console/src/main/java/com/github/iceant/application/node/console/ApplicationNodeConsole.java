package com.github.iceant.application.node.console;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ApplicationNodeConsole {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new SpringApplicationBuilder(ApplicationNodeConsole.class)
                .bannerMode(Banner.Mode.OFF)
                .run(args);
    }
}
