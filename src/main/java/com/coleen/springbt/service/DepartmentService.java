package com.coleen.springbt.service;

import com.coleen.springbt.entity.Department;
import com.coleen.springbt.errorhandling.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);

    List<Department> getAllDepartments();

    Department findDepartmentById(Long id) throws DepartmentNotFoundException;

    void deleteDepartment(Long id);

    Department updateDepartment(Long id, Department department);
}
