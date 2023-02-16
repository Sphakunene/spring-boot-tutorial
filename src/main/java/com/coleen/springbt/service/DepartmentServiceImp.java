package com.coleen.springbt.service;

import com.coleen.springbt.entity.Department;
import com.coleen.springbt.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImp implements DepartmentService{
    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> getAllDepartments() {
       return departmentRepository.findAll();
    }

    @Override
    public Department findDepartmentById(Long id) {
        return departmentRepository.findById(id).orElseThrow();
    }

    @Override
    public void deleteDepartment(Long id) {
        departmentRepository.deleteById(id);
    }

    @Override
    public Department updateDepartment(Long id, Department department) {
            Department departmentExist = departmentRepository.findById(id).get();
            departmentExist.setDepartmentName(department.getDepartmentName());
            departmentExist.setDepartmentAddress(department.getDepartmentAddress());
            departmentExist.setDepartmentCode(department.getDepartmentCode());

            return  departmentRepository.save(departmentExist);
        }


}
