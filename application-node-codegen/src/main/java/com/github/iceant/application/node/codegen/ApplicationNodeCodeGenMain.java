package com.github.iceant.application.node.codegen;

import com.github.iceant.application.node.codegen.services.MyBatisPlusCodeGeneratorService;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ApplicationNodeCodeGenMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(ApplicationNodeCodeGenMain.class)
                .web(WebApplicationType.NONE)
                .run(args);
        MyBatisPlusCodeGeneratorService service = context.getBean(MyBatisPlusCodeGeneratorService.class);
        service.run();
    }
}
