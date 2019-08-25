package com.huang.configclientapollo;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableApolloConfig(value = "application")
public class ConfigClientApolloApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApolloApplication.class, args);
    }

}
