package com.teamtreehouse.giflib;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.thymeleaf.extras.java8time.dialect.Java8TimeDialect;
import org.thymeleaf.spring4.SpringTemplateEngine;

@EnableAutoConfiguration
@ComponentScan
public class AppConfig implements CommandLineRunner {
    @Autowired
    private SpringTemplateEngine templateEngine;

    public static void main(String[] args) {
        SpringApplication.run(AppConfig.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        templateEngine.addDialect(new Java8TimeDialect());
    }
}