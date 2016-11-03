package com.gizwits.main;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by feel on 2016/10/23.
 * curl  http://localhost:9020/add
 */
@SpringBootApplication(scanBasePackages = {"com.gizwits"})
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.gizwits.controller", "com.gizwits.service"})
public class FeignService {

    private static final Logger logger = LoggerFactory.getLogger(FeignService.class);


    public static void main(String[] args) throws Exception {

        //开启监控 http://localhost:8080/health

        SpringApplication.run(FeignService.class, args);


    }
}

