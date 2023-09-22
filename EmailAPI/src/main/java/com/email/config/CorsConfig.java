package com.email.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping(
                        "http://localhost:8080/sendemail"); // Specify the API endpoint(s) you want to allow CORS for.
                registry.addMapping(
                                "http://localhost:4200") // Specify the origins (domains) that are allowed to access
                        // your API.
                        .allowedMethods("GET", "POST", "PUT", "DELETE") // Specify the HTTP methods that are allowed.
                        .allowCredentials(true); // Allow credentials (e.g., cookies) to be sent with the request.
            }
        };
    }
}