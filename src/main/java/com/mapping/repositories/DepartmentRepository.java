package com.mapping.repositories;

import com.mapping.employeeEntity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    Optional<Department> findAllByDepartment(String department);
}
