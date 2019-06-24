package com.study.springboot.study.wired.manualWired.module2.annotation;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 *  激活helloworld模块
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
//@Import(HelloWorldConfiguration.class) //注解配置跳转，没有什么弹性
@Import(HelloWorldImportSelector.class) //接口配置跳转，有一些弹性，可以根据逻辑返回多种configuration
public @interface EnableHelloWorld {

}
