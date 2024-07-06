package com.doc_doc.gateway.controller;

import com.doc_doc.gateway.dto.ClinicAndFeedbacks;
import com.doc_doc.gateway.dto.DoctorsAndOrders;
import com.doc_doc.gateway.service.ClinicService;
import com.doc_doc.gateway.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/management")
public class ManagementClinicsAndDoctorsController {
    private final ClinicService clinicService;
    private final DoctorService doctorService;

    @Autowired
    public ManagementClinicsAndDoctorsController(ClinicService clinicService, DoctorService doctorService) {
        this.clinicService = clinicService;
        this.doctorService = doctorService;
    }

    @GetMapping("/clinic/{idClinic}")
    public Mono<ClinicAndFeedbacks> getClinicById(@PathVariable long idClinic) {
        return clinicService.getClinicAndFeedbacks(idClinic);
    }

    @GetMapping("/doctors")
    public List<DoctorsAndOrders> getDoctorsAndOrders(@RequestParam String city,
                                                      @RequestParam int numberPage,
                                                      @RequestParam int countDoctorsPerPage) {
        return doctorService.getDoctorsAndOrders(city,numberPage,countDoctorsPerPage);
    }
}

