package com.padmaprimaryschoolstudent.model.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StudentDTO {
    private Long studentId;
    @Setter
    @Getter
    private String studentName;
    @Setter
    @Getter
    private double studentFee;
}
