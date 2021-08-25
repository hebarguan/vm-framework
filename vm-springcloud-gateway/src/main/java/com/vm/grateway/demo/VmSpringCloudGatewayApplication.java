package com.vm.grateway.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VmSpringCloudGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(VmSpringCloudGatewayApplication.class, args);

        System.out.println(SpringHolder.getApplicationContext().getEnvironment().getProperty("ab"));
    }

}
