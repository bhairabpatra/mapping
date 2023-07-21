package com.mapping.controllers;


import com.mapping.employeeEntity.Employee;
import com.mapping.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("createEmp")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
        Employee newEmployee = employeeService.createEmployee(employee);
        return new ResponseEntity<>(newEmployee, HttpStatus.CREATED);
    }

    @GetMapping("getEmployee")
    public ResponseEntity<List<Employee>> getAllEmployee() {
        List<Employee> allEmp = employeeService.getAllEmployee();
        return new ResponseEntity<>(allEmp, HttpStatus.OK);

    }

    @GetMapping("getEmployee/{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable Long id) {
        Employee emp = employeeService.getEmployee(id);
        return new ResponseEntity<>(emp,HttpStatus.OK);
    }


}
