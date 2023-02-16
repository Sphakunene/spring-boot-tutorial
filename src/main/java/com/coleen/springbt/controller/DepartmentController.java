package com.coleen.springbt.controller;

import com.coleen.springbt.entity.Department;
import com.coleen.springbt.service.DepartmentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department){
       return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> getAllDepartment(){
        return departmentService.getAllDepartments();
    }
    @GetMapping("/departments/{id}")
    public Department getDepartmentById(@PathVariable("id") Long id ){
        return  departmentService.findDepartmentById(id);
    }

    @DeleteMapping("/departments/{id}")

    public void deleteDepartment(@PathVariable("id") Long id){
        departmentService.deleteDepartment(id);
    }
    @PutMapping("/departments/{id}")
    public  Department updateDepartment(@PathVariable("id") Long id,@RequestBody Department department){
        return departmentService.updateDepartment(id,department);

    }

}
