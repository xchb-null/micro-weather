package com.xchb.mw.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author XDD
 * @project micro-weather
 * @date 2020/5/9
 * @description Good Good Study,Day Day Up.
 */
@SpringBootApplication
@EnableDiscoveryClient   // eureka客户端
@EnableFeignClients     //启用feign消费者
@EnableCircuitBreaker  //启用hystrix熔断
public class MicroWeatherWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroWeatherWebApplication.class,args);
    }

}
