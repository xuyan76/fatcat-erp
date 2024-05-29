package com.fatcat.erp.services.system;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SystemServiceApplication {
    public static void main(String[] args){
        new SpringApplicationBuilder(SystemServiceApplication.class).web(WebApplicationType.SERVLET).run(args);
    }
}
