package com.padmaelementoryschoolemployee.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class EmployeeDTO {
        private String employeeName;
        private double employeeSalary;

}
