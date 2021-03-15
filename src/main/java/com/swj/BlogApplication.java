package com.swj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@SpringBootApplication
public class BlogApplication extends WebMvcConfigurationSupport {
    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class, args);
    }

}
