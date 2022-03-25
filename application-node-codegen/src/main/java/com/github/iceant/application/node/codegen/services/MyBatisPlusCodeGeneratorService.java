package com.github.iceant.application.node.codegen.services;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.ITypeConvert;
import com.baomidou.mybatisplus.generator.config.po.TableField;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.config.rules.IColumnType;
import com.baomidou.mybatisplus.generator.engine.BeetlTemplateEngine;
import org.springframework.stereotype.Service;

@Service
public class MyBatisPlusCodeGeneratorService {
    public void run() {
        FastAutoGenerator.create(new DataSourceConfig.Builder("jdbc:sqlite:./meta.db", null, null))
                .globalConfig(builder -> {
                    builder.author("陈鹏") // 设置作者
                            .disableOpenDir()
//                            .enableSwagger() // 开启 swagger 模式
                            .outputDir("./application-node-console/src/main/java"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.github.iceant.application.node.console") // 设置父包名
                            .moduleName("storage") // 设置父包模块名
//                            .pathInfo(Collections.singletonMap(OutputFile.xml, "D://"))// 设置mapperXml生成路径
                    ;
                })
                .strategyConfig(builder -> {
//                    builder.addTablePrefix("t_", "c_"); // 设置过滤表前缀
                    builder.addExclude("sqlite_sequence");
                    builder.entityBuilder()
                            .enableChainModel()
                            .enableLombok()
                            .enableColumnConstant()
                            .enableTableFieldAnnotation()
                            .fileOverride();
                }).templateConfig(builder -> {
                    builder.controller("").xml("");
                })
                .templateEngine(new BeetlTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
