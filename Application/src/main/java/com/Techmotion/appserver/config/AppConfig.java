package com.Techmotion.appserver.config;

import com.Techmotion.appserver.service.AIService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class AppConfig {


    @Bean
    public AIService aiService(WebClient.Builder webClientBuilder) {
        return new AIService(webClientBuilder);
    }
}
