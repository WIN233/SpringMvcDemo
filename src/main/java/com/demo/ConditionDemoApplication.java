package com.demo;

import com.demo.annotation.ConditionalOnSystemProperty;
import com.demo.annotation.EnableHelloWorld;
import com.demo.service.CalculateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.ConfigurableEnvironment;

public class ConditionDemoApplication {

    @Bean
    @ConditionalOnSystemProperty(name = "user.name",value = "admin")
    public String hello() {
        return "Hello";
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ConditionDemoApplication.class);
        System.out.println(context.getBean("hello"));


    }
}
