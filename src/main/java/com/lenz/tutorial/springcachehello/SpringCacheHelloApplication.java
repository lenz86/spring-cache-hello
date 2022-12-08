package com.lenz.tutorial.springcachehello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @EnableCaching annotation must be set for working with spring-cache
 */
@SpringBootApplication
@EnableCaching
public class SpringCacheHelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCacheHelloApplication.class, args);
    }

}
