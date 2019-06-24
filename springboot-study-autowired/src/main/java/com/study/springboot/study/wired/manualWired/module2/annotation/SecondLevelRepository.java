package com.study.springboot.study.wired.manualWired.module2.annotation;

import java.lang.annotation.*;


/**
 *
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@FirstLevelRepository
public @interface SecondLevelRepository {
    String value() default  "";
}
