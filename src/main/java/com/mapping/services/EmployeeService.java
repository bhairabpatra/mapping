package com.mapping.services;

import com.mapping.employeeEntity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmployeeService {

    Employee createEmployee(Employee employee);

    List<Employee> getAllEmployee();

    Employee getEmployee(Long id);
}
