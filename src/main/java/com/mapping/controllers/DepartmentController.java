package com.mapping.controllers;

import com.mapping.employeeEntity.Department;
import com.mapping.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;
    @PostMapping("addDepartment")
    public ResponseEntity<Department> createDepartment(@RequestBody Department dep){
        Department newDep = departmentService.createDepartment(dep);
        return new ResponseEntity<>(newDep, HttpStatus.CREATED);
    }

    @GetMapping("getAllDepartment")
    public ResponseEntity<List<Department>> getAllDepartment(){
        List<Department> getAllDep = departmentService.getAllDep();
            return  new ResponseEntity<>(getAllDep, HttpStatus.OK);

    }
}
