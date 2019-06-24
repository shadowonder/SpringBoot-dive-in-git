package com.study.springboot.study.wired.manualWired.module1.bootstrap1;

import com.study.springboot.study.wired.manualWired.module1.repository1.MySecondLevelRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * 仓库的引导类
 * java注解并没有派生性质或者继承性质
 * spring加强了component的注解检索方法，是的component有了继承性
 *
 */
@ComponentScan(basePackages = "com.study.springboot.study.wired.manualWired.module1.repository1")
public class RepositoryBootStrap {
    public static void main(String[] args) {
        //手动获取springcontext
        ConfigurableApplicationContext context = new SpringApplicationBuilder(RepositoryBootStrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        //在springcontext中获取repository这个bean对象
        //如果不存在，就会报错。我们这里就是用这句话检查我们自己写的repo是否成为bean并进入容器
        MySecondLevelRepository mySecondLevelRepository =
                context.getBean("mySecondLevelRepository", MySecondLevelRepository.class);
        System.out.println(mySecondLevelRepository);

        context.close();
    }
}
