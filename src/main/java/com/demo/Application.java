package com.demo;

import com.demo.annotation.EnableHelloWorld;
import com.demo.service.CalculateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.ConfigurableEnvironment;

@EnableHelloWorld
@ComponentScan(basePackages = "com.demo.service")
public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Application.class);
        CalculateService calculateService = context.getBean(CalculateService.class);
        System.out.println(calculateService.sum(1,2,4,5,5));

    }
}
