package com.doc_doc.gateway.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Clinic {
    private long clinicId;
    private String name;
    private String address;
    private int cityId;
    private int phoneNumber;
    private String description;
}
