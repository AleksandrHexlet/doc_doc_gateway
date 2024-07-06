package com.doc_doc.gateway.dto;

import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Feedback {
    private Long id;
    private String text;
    private LocalDateTime date;

}
