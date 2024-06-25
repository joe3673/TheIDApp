package com.Techmotion.appserver.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class AIService {
    private final WebClient webClient;

    public AIService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://api.openai.com/v1").build();
    }

    public String getAiResponse(String prompt) {
        return this.webClient.post()
                .uri("/engines/davinci-codex/completions")
                .header("Authorization", "Bearer " + System.getenv("OPENAI_API_KEY"))
                .bodyValue("{ \"prompt\": \"" + prompt + "\", \"max_tokens\": 100 }")
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }
}

