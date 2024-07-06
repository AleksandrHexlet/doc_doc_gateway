package com.doc_doc.gateway.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClinicAndFeedbacks {
   Clinic clinic;
   List<Feedback> feedbackList;
}
