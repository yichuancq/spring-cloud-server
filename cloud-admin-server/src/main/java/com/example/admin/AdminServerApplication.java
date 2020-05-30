package com.example.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @calss name AdminServerApplication
 * @description: spring cloud admin server
 * @author: yichuan
 * @create time: 2020/05/30 11:10
 */
@SpringBootApplication
@EnableAdminServer
@EnableEurekaClient
@EnableDiscoveryClient
public class AdminServerApplication {
    //http://localhost:8090/#/applications
    public static void main(String[] args) {
        SpringApplication.run(AdminServerApplication.class, args);
    }
}
