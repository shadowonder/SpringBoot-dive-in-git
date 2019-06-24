package com.study.springboot.study.wired.manualWired.module3.bootstrap;


import com.study.springboot.study.wired.manualWired.module3.condition.ConditionalOnSystemProperty;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * 系统属性条件引导类
 */
//@ConditionalOnSystemProperty(name = "user.name", value = "shadowave")
public class ConditionalOnSystemPropertyBootstrap {

    @Bean
    //根据条件装配，如果满足条件，就装配
    @ConditionalOnSystemProperty(name = "user.name", value = "shuo")
    public String helloWorld(){
        return "Hello world Shuo";
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(ConditionalOnSystemPropertyBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        //通过名称获取bean
        String helloWorld = context.getBean("helloWorld", String.class);
        System.out.println(helloWorld);

        context.close();
    }
}
