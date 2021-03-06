package com.gizwits.main;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * http://localhost:8022/actuator
 * http://localhost:8022/docs/
 * <p>
 * Created by feel on 2016/10/23.
 */
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = {"com.gizwits"})
public class ComputerService {

    private static final Logger logger = LoggerFactory.getLogger(ComputerService.class);


    public static void main(String[] args) throws Exception {

        //开启监控 http://localhost:8080/health

        SpringApplication.run(ComputerService.class, args);

    }
}