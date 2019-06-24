package com.study.springboot.study.wired.manualWired.module3.condition;


import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

/**
 * 系统属性条件判断
 * 获取bean的属性，然后返回值为是否装配这bean到context中
 */
public class OnSystemPropertyCondition implements Condition {//也可以实现springbootcondition
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        //这样就可以获得注解的属性了，放入了map中
        Map<String, Object> attributes = annotatedTypeMetadata.getAnnotationAttributes(ConditionalOnSystemProperty.class.getName());
        String propertyName = String.valueOf(attributes.get("name"));
        String propertyValue = String.valueOf(attributes.get("value"));

        //在系统中查看系统属性的值，也就是windows用户名
        String javaPropertyValue = System.getProperty(propertyName);

        //看一下系统中的属性，看看是否相等
//        return propertyValue.equals(javaPropertyValue);
        return "shuo".equals(propertyValue);
    }
}
