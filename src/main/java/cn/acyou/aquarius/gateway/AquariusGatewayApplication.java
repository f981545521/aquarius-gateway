package cn.acyou.aquarius.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class AquariusGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(AquariusGatewayApplication.class, args);
    }

}
