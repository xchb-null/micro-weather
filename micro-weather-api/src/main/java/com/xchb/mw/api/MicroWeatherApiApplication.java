package com.xchb.mw.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author XDD
 * @project micro-weather
 * @date 2020/5/9
 * @description Good Good Study,Day Day Up.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MicroWeatherApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroWeatherApiApplication.class,args);
    }

}
