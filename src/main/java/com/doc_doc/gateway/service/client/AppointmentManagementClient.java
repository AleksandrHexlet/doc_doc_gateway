package com.doc_doc.gateway.service.client;

import com.doc_doc.gateway.configuration.WebClientBuilder;
import com.doc_doc.gateway.dto.Feedback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class AppointmentManagementClient {
    private WebClient webClient;

    @Autowired
    public AppointmentManagementClient(WebClientBuilder webClientBuilder) {
        this.webClient = webClientBuilder.webClient().baseUrl("/maa/appointment").build();
    }

    public Mono<List<Feedback>> getFeedbacks(long clinicId){

        return webClient.get().uri("/feedback").retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<Feedback>>() {});
    }
}
