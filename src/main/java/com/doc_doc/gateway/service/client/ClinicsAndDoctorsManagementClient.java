package com.doc_doc.gateway.service.client;

import com.doc_doc.gateway.configuration.WebClientBuilder;
import com.doc_doc.gateway.dto.Clinic;
import com.doc_doc.gateway.dto.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class ClinicsAndDoctorsManagementClient {
    private WebClient webClient;

    @Autowired
    public ClinicsAndDoctorsManagementClient(WebClientBuilder webClientBuilder) {
        this.webClient = webClientBuilder.webClient().baseUrl("/cad/clinic").build();
    }
    public Mono<Clinic> getClinic(long idClinic) {
        return webClient.get().uri("/{idClinic}", idClinic)
                .retrieve().bodyToMono(Clinic.class);
    }

    public List<Doctor> getDoctor(String city,int numberPage,
                                  int countDoctorsPerPage) {
        Mono<List<Doctor>> doctroList = webClient.

    }
}
