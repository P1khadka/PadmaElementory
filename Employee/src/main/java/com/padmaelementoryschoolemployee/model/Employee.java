package com.padmaelementoryschoolemployee.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "employee_tbl")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long employeeId;
    private String employeeName;
    private double employeeSalary;
}
