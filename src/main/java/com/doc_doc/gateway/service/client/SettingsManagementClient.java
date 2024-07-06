package com.doc_doc.gateway.service.client;

import com.doc_doc.gateway.configuration.WebClientBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class SettingsManagementClient {
    private WebClient webClient;

    @Autowired
    public SettingsManagementClient(WebClientBuilder webClientBuilder) {
        this.webClient = webClientBuilder.webClient().baseUrl("/settings")
                .build();
    }
}
