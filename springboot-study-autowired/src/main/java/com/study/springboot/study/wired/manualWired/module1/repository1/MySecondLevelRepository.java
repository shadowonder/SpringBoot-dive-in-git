package com.study.springboot.study.wired.manualWired.module1.repository1;

import com.study.springboot.study.wired.manualWired.module1.annotation1.SecondLevelRepository;

/**
 * 我自定义的 {@link SecondLevelRepository}
 */
@SecondLevelRepository("secondLevelRepository") //bean的名称，因为继承了@Repository
public class MySecondLevelRepository {
}
