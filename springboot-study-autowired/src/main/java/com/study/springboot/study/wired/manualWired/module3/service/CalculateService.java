package com.study.springboot.study.wired.manualWired.module3.service;

/**
 * 计算服务
 */
public interface CalculateService {
    /**
     * 多个整数求和
     * @param values
     * @return
     */
    Integer sum(Integer... values);
}
