package com.study.springboot.study.wired.manualWired.module3.bootstrap;

import com.study.springboot.study.wired.manualWired.module3.service.CalculateService;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * {@link com.study.springboot.study.wired.manualWired.module3.service.CalculateService} 引导类
 *  这里直接用springbootapplication
 */
@SpringBootApplication(scanBasePackages = "com.study.springboot.study.wired.manualWired.module3.service")
public class CalculateServiceBootstrap {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(CalculateServiceBootstrap.class)
                .web(WebApplicationType.NONE)
                .profiles("Java7") //使用java7的profile
//                .profiles("Java8") //使用java8的profile
                .run(args);

        CalculateService calculateService =
                context.getBean(CalculateService.class);
        System.out.println(calculateService.sum(1,2,3,4,5,6,7,8,9,10));
        context.close();
    }
}
