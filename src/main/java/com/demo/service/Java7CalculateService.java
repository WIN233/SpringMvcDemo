package com.demo.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("java7")
public class Java7CalculateService implements CalculateService {
    @Override
    public Integer sum(Integer... values) {
        System.out.println("Java7 calculate");
        Integer sum = 0;
        for (Integer value:values) {
            sum += value;
        }
        return sum;
    }
}
