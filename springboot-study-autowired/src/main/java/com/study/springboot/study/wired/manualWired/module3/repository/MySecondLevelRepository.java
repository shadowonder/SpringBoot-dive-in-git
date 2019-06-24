package com.study.springboot.study.wired.manualWired.module3.repository;

import com.study.springboot.study.wired.manualWired.module3.annotation.SecondLevelRepository;

/**
 * 我自定义的 {@link SecondLevelRepository}
 */
@SecondLevelRepository("secondLevelRepository") //bean的名称，因为继承了@Repository
public class MySecondLevelRepository {
}
