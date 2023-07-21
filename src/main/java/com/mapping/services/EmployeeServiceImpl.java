package com.mapping.services;

import com.mapping.employeeEntity.Employee;
import com.mapping.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private static List<Employee> list = new ArrayList<>();
    @Autowired
    private EmployeeRepository employeeDao;
    @Override
    public Employee createEmployee(Employee employee) {
       return employeeDao.save(employee);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeDao.findAll();
    }

    @Override
    public Employee getEmployee(Long id) {

        Optional<Employee> emp = employeeDao.findById(id);
        if (!emp.isPresent()) {
            System.out.println("Not found");
        }
        return  emp.get();
    }
}
