package com.coleen.springbt.controller;

import com.coleen.springbt.entity.Department;
import com.coleen.springbt.service.DepartmentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
@WebMvcTest(DepartmentController.class)
class DepartmentControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private DepartmentService departmentService;

    private Department department;

    @BeforeEach
    void setUp() {
         department = Department.builder()
                .departmentName("IT")
                .departmentCode("IT-06")
                .departmentAddress("Sandton")
                .build();
    }

    @Test
    void saveDepartment() {
    }

    @Test
    void getDepartmentById() {
    }
}