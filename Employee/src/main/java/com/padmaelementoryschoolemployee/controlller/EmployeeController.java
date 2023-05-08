package com.padmaelementoryschoolemployee.controlller;

import com.padmaelementoryschoolemployee.model.Employee;
import com.padmaelementoryschoolemployee.model.dto.EmployeeDTO;
import com.padmaelementoryschoolemployee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping("employee-ping")
    public String employeePing(){
        return "Employee ping";
    }
    @GetMapping(value = "/employee-list")
    public List<Employee> employeeList(){
        return employeeService.employeeList();
    }
    @GetMapping(value = "/employee-details/{id}")
    public Employee employeeDetails(@PathVariable(value = "id") Long employeeId){
        return employeeService.employeeDetails(employeeId);
    }
    @PostMapping("/employee-create")
    public Employee createEmployee(@RequestBody EmployeeDTO employeeDTO){
      Employee employeeSaved= employeeService.createEmployee(employeeDTO);
      return employeeSaved;
    }
    @PutMapping("/employee-update/{id}")
    public Employee updateEmployee(@PathVariable(value = "id") Long employeeId, @RequestBody EmployeeDTO employeeDTO){
        Employee updatedEmployee=employeeService.updateEmployee(employeeId, employeeDTO);
        return updatedEmployee;
    }
    @PatchMapping(value = "/employee-edit/{id}")
    public Employee editEmployee(@PathVariable (value = "id") Long employeeId, @RequestBody EmployeeDTO employeeDTO){
        Employee editedEmployee=employeeService.editEmployee(employeeId, employeeDTO);
        return editedEmployee;
    }
    @DeleteMapping(value = "/employee-delete/{id}")
    public String deleteEmployee(@PathVariable (value = "id") Long employeeId){
         employeeService.deleteEmployee(employeeId);
         return "Delete Successfully";
    }
}
