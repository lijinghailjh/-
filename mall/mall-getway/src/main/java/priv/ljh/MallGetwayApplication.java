package priv.ljh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MallGetwayApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallGetwayApplication.class, args);
    }

}