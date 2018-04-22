package com.github.ykiselev;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author Yuriy Kiselev (uze@yandex.ru).
 */
@SpringBootApplication
public class HelloApp {

    @Value("${external.jdbc.url}")
    private String externalJdbcUrl;

    @Bean
    CommandLineRunner runner() {
        return args -> {
            System.out.println("External jdbc url: " + externalJdbcUrl);
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloApp.class, args);
    }
}
