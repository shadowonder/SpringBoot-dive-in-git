package com.study.springboot.study.wired.manualWired.module2.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * HelloWorld的配置
 */
@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String helloWorld(){
        return "Hello World 2019";
    }
}
