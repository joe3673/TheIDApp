package com.Techmotion.appserver.config;

import com.Techmotion.appserver.service.AIService;
import com.Techmotion.appserver.service.model.AI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public AI aiService() {
        return new AIService();
    }
}
