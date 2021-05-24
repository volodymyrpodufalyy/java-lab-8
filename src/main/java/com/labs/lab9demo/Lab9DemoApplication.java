package com.labs.lab9demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.labs.lab9demo.service")
public class Lab9DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lab9DemoApplication.class, args);
    }



}
