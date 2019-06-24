package com.study.springboot.study.wired.manualWired.module2.annotation;

import org.springframework.stereotype.Repository;

import java.lang.annotation.*;


/**
 * 第一级， Repository @Repository
 *  继承了repository
 *
 * 装配具有继承性，这个注解了repository也就继承了repository
 *
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Repository
public @interface FirstLevelRepository {
    String value() default  "";
}
