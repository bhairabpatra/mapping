package com.mapping.services;

import com.mapping.employeeEntity.Department;

import java.util.List;

public interface DepartmentService {
    public Department createDepartment(Department department);

    public List<Department> getAllDep();
}
