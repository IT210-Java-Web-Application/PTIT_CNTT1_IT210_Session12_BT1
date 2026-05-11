package com.rk.bt1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HospitalWebApplication {

    public static void main(String[] args) {

        SpringApplication.run(HospitalWebApplication.class, args);

        System.out.println("Hospital Web Service is ready on Embedded Tomcat!");
    }
}