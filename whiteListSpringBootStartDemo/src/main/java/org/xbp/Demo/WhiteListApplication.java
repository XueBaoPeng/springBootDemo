package org.xbp.Demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@Configuration
@ComponentScan(basePackages = "org.xbp")
@ImportResource(locations = {"classpath:spring-config.xml"})
public class WhiteListApplication {
    public static void main(String[] args) {
        SpringApplication.run(WhiteListApplication.class, args);
    }
}

