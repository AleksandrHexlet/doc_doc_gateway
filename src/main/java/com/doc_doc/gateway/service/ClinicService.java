package com.doc_doc.gateway.service;

import com.doc_doc.gateway.dto.ClinicAndFeedbacks;
import com.doc_doc.gateway.service.client.AppointmentManagementClient;
import com.doc_doc.gateway.service.client.ClinicsAndDoctorsManagementClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class ClinicService {
    private AppointmentManagementClient appointmentManagementClient;
    private ClinicsAndDoctorsManagementClient clinicsAndDoctorsManagementClient;

    @Autowired
    public ClinicService(AppointmentManagementClient appointmentManagementClient,
                         ClinicsAndDoctorsManagementClient clinicsAndDoctorsManagementClient) {
        this.appointmentManagementClient = appointmentManagementClient;
        this.clinicsAndDoctorsManagementClient = clinicsAndDoctorsManagementClient;
    }

    public Mono<ClinicAndFeedbacks> getClinicAndFeedbacks(long clinicId){
     return clinicsAndDoctorsManagementClient.getClinic(clinicId)
                .zipWith(appointmentManagementClient.getFeedbacks(clinicId)).flatMap(tuple -> {
                return Mono.just(ClinicAndFeedbacks.builder().clinic(tuple.getT1())
                        .feedbackList(tuple.getT2()).build());
             });
    }
}
