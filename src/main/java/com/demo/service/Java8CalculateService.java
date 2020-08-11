package com.demo.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

@Service
@Profile("java8")
public class Java8CalculateService implements CalculateService {
    @Override
    public Integer sum(Integer... values) {
        System.out.println("Java8 calculate");
        Integer sum = Stream.of(values).reduce(0, Integer::sum);
        return sum;
    }
}
