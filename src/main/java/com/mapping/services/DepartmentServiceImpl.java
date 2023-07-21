package com.mapping.services;

import com.mapping.employeeEntity.Department;
import com.mapping.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository DepartmentDao;

    @Override
    public Department createDepartment(Department department) {
        Optional<Department> existingDep = DepartmentDao.findAllByDepartment(department.getDepartment());
        try {
            if (existingDep.isEmpty()) {
                return DepartmentDao.save(department);
            }
        } catch (Exception e) {
                System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public List<Department> getAllDep() {
        Set<String> nameSet = new HashSet<>();
        List<Department> allDep =  DepartmentDao.findAll().stream()
                .filter(e -> nameSet.add(e.getDepartment()))
                .collect(Collectors.toList());
        return allDep;
    }
}
