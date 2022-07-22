package com.edu.springbootpagingsortingfiltering.controller;

import com.edu.springbootpagingsortingfiltering.model.Employee;
import com.edu.springbootpagingsortingfiltering.model.EmployeePage;
import com.edu.springbootpagingsortingfiltering.model.EmployeeSearchCriteria;
import com.edu.springbootpagingsortingfiltering.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
@AllArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping
    public ResponseEntity<Page<Employee>> getEmployees(EmployeePage employeePage,
                                                       EmployeeSearchCriteria employeeSearchCriteria){
        return new ResponseEntity<>(employeeService.getEmployees(employeePage, employeeSearchCriteria), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
        return new ResponseEntity<>(employeeService.addEmployee(employee), HttpStatus.OK);
    }
}
