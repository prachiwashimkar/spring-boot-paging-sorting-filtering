package com.edu.springbootpagingsortingfiltering.service;

import com.edu.springbootpagingsortingfiltering.model.Employee;
import com.edu.springbootpagingsortingfiltering.model.EmployeePage;
import com.edu.springbootpagingsortingfiltering.model.EmployeeSearchCriteria;
import com.edu.springbootpagingsortingfiltering.repository.EmployeeCriteriaRepository;
import com.edu.springbootpagingsortingfiltering.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeService {
    private final EmployeeCriteriaRepository employeeCriteriaRepository;
    private final EmployeeRepository employeeRepository;

    public Page<Employee> getEmployees(EmployeePage employeePage, EmployeeSearchCriteria employeeSearchCriteria){
        return employeeCriteriaRepository.findAllWithFilters(employeePage, employeeSearchCriteria);
    }
    public Employee addEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
}
