package com.padmaelementoryschoolemployee.service;

import com.padmaelementoryschoolemployee.model.Employee;
import com.padmaelementoryschoolemployee.model.dto.EmployeeDTO;
import com.padmaelementoryschoolemployee.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> employeeList() {
        ArrayList arrayList = new ArrayList<>();

        Employee employee1 = new Employee(1L, "Prakash Khadka", 8000);
        Employee employee2 = new Employee(2L, "Archu Khadka", 7000);
        Employee employee3 = new Employee(3L, "Karma Khadka", 10000);
        arrayList.add(employee1);
        arrayList.add(employee2);
        arrayList.add(employee3);
        return arrayList;

    }

    public Employee employeeDetails(Long employeeId) {
        Employee employee = new Employee();
        Optional<Employee> optionalEmployee = employeeRepository.findById(employeeId);
        if (optionalEmployee.isPresent()) {
            Employee availableEmployee = optionalEmployee.get();
            return availableEmployee;
        } else throw new RuntimeException("Invalid Entry");
    }

    public Employee createEmployee(EmployeeDTO employeeDTO) {
        Employee employee = new Employee();
        employee.setEmployeeName(employeeDTO.getEmployeeName());
        employee.setEmployeeSalary(employeeDTO.getEmployeeSalary());
        Employee savedEmployee = employeeRepository.save(employee);
        return savedEmployee;

    }

    public Employee updateEmployee(Long employeeId, EmployeeDTO employeeDTO) {
        Optional<Employee> optionalEmployee = employeeRepository.findById(employeeId);
        if (optionalEmployee.isPresent()) {
            Employee availableEmployee = optionalEmployee.get();
            availableEmployee.setEmployeeName(employeeDTO.getEmployeeName());
            availableEmployee.setEmployeeSalary(employeeDTO.getEmployeeSalary());
            return employeeRepository.save(availableEmployee);
        } else {
            throw new RuntimeException("Invalid Entry");
        }
    }

    public Employee editEmployee(Long employeeId, EmployeeDTO employeeDTO) {
        Optional<Employee> optionalEmployee = employeeRepository.findById(employeeId);
        if (optionalEmployee.isPresent()) {
            Employee availableEmployee = optionalEmployee.get();
            availableEmployee.setEmployeeSalary(employeeDTO.getEmployeeSalary());
            return employeeRepository.save(availableEmployee);
        } else {
            throw new RuntimeException("Invalid Entry");
        }
    }

    public String deleteEmployee(Long employeeId) {
        Optional<Employee> optionalEmployee = employeeRepository.findById(employeeId);
        if (optionalEmployee.isPresent()) {
            employeeRepository.deleteById(employeeId);
            return "Delete Successfully";
        } else {
            throw new RuntimeException("Invalid Entry");
        }

    }
}
