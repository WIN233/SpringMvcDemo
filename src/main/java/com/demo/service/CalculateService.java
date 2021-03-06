package com.demo.service;

/**
 * 计算服务
 */
public interface CalculateService {

    /**
     * 从多个整数sum求和
     * @param values 多个整数
     * @return 累加值
     */
    Integer sum(Integer ...values);

}
