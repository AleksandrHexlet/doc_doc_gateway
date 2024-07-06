package com.doc_doc.gateway.service;

import com.doc_doc.gateway.dto.Doctor;
import com.doc_doc.gateway.dto.DoctorsAndOrders;
import com.doc_doc.gateway.service.client.ClinicsAndDoctorsManagementClient;
import com.doc_doc.gateway.service.client.SettingsManagementClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {
    private final ClinicsAndDoctorsManagementClient clinicsAndDoctorsManagementClient;
    private final SettingsManagementClient settingsManagementClient;

    @Autowired
    public DoctorService(ClinicsAndDoctorsManagementClient clinicsAndDoctorsManagementClient, SettingsManagementClient settingsManagementClient) {
        this.clinicsAndDoctorsManagementClient = clinicsAndDoctorsManagementClient;
        this.settingsManagementClient = settingsManagementClient;
    }

    public List<DoctorsAndOrders> getDoctorsAndOrders(String city,int numberPage,
                                                      int countDoctorsPerPage) {
    List<Doctor> doctorList = clinicsAndDoctorsManagementClient.getDoctor(city,numberPage,countDoctorsPerPage);
    return null;
    }
}
//Отдаёт список врачей с отзывами и вариантами сортировки doc_doc_gateway