package com.coleen.springbt.service;

import com.coleen.springbt.entity.Department;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);

    List<Department> getAllDepartments();

    Department findDepartmentById(Long id);

    void deleteDepartment(Long id);

    Department updateDepartment(Long id, Department department);
}
