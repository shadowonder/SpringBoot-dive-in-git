package com.study.springboot.study.wired.manualWired.module3.condition;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * java系统属性条件判断
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@Documented
@Conditional({OnSystemPropertyCondition.class})
public @interface ConditionalOnSystemProperty {
    /**
     * java系统属性的名称
     * @return
     */
    String name();

    /**
     * java系统属性值
     * @return
     */
    String value();
}
