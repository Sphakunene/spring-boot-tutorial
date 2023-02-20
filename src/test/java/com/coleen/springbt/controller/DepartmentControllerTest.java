package com.coleen.springbt.controller;

import com.coleen.springbt.entity.Department;
import com.coleen.springbt.service.DepartmentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.client.match.MockRestRequestMatchers;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

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
                 .departmentId(1L)
                .build();
    }

    @Test
    void saveDepartment() throws Exception {
       Department inputDepartment = Department.builder()
                .departmentName("IT")
                .departmentCode("IT-06")
                .departmentAddress("Sandton")
                 .build();

        Mockito.when(departmentService.saveDepartment(inputDepartment)).thenReturn(department);
        mockMvc.perform(post("/api/departments").contentType(MediaType.APPLICATION_JSON)
                .content("{ \"departmentName\": \"IT\"," +
                        " \"departmentAddress\": \"Sandton\"," +
                        " \"departmentCode\": \"IT-06\" },")).
                andExpect(MockMvcResultMatchers.status().isOk());


    }


}