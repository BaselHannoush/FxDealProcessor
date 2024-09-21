package com.baselhannoush;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.baselhannoush.Repository") // Adjust if needed
public class FxDealProcessorApplication {
    public static void main(String[] args) {
        SpringApplication.run(FxDealProcessorApplication.class, args);
    }
}