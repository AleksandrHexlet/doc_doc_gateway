package com.doc_doc.gateway.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientBuilder {
    @Bean
    public WebClient.Builder webClient(){
           return WebClient.builder();
    }
}
