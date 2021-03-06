package com.ztuo.bc.wallet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableEurekaClient
@SpringBootApplication
@EnableScheduling
@EnableSwagger2
public class WalletRpcApplication {
    public static void main(String[] args){
        SpringApplication.run(WalletRpcApplication.class,args);
    }
}
