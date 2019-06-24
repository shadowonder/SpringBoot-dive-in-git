package com.study.springboot.study.wired.manualWired.module2.annotation;

import com.study.springboot.study.wired.manualWired.module2.configuration.HelloWorldConfiguration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * HelloWorld {@Link ImportSelector} 实现
 */
public class HelloWorldImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String [] { HelloWorldConfiguration.class.getName()};
    }
}
