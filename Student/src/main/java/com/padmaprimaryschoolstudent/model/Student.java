package com.padmaprimaryschoolstudent.model;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long studentId;
    @Setter
    @Getter
    private String studentName;
    @Setter
    @Getter
    private double studentFee;
}
