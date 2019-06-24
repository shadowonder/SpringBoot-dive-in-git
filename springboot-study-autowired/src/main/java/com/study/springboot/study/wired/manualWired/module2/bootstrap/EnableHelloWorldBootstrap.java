package com.study.springboot.study.wired.manualWired.module2.bootstrap;

import com.study.springboot.study.wired.manualWired.module2.annotation.EnableHelloWorld;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 引导类
 *  这里的Enablehelloworld就会引入selector，然后引入configuration，最终引入helloworld的bean
 */
@EnableHelloWorld
public class EnableHelloWorldBootstrap {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(EnableHelloWorldBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        //在springcontext中获取repository这个bean对象
        //如果不存在，就会报错。我们这里就是用这句话检查我们自己写的repo是否成为bean并进入容器
        String helloWorld =
                context.getBean("helloWorld", String.class);
        System.out.println(helloWorld);

        context.close();
    }
}
