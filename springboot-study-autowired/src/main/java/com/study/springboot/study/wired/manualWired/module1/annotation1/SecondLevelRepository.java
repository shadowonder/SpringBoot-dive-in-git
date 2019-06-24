package com.study.springboot.study.wired.manualWired.module1.annotation1;

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
