package com.example.game;


import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RestController;


@EnableEurekaClient
@SpringBootApplication
@RestController
@ConfigurationProperties("game-development")
public class GameApplication {
    public static void main(String[] args) {
        SpringApplication.run(GameApplication.class, args);
    }

}
