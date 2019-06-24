package com.study.springboot.study.wired.autoWired;

import com.study.springboot.study.wired.manualWired.module3.condition.ConditionalOnSystemProperty;
import org.springframework.context.annotation.Configuration;

/**
 * Helloworld自动装配
 * 在spring.factories中配置了
 */
@Configuration //spring模式注解
@EnableHelloWorld //springenable模块装配
@ConditionalOnSystemProperty(name = "user.name", value = "shuo") //条件装配
public class HelloWorldAutoConfiguration {

}
