package com.codewithexcel.application.controller;


import com.codewithexcel.application.entity.Department;
import com.codewithexcel.application.service.DepartmentService;
import com.codewithexcel.application.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {


    @Autowired
    private DepartmentService departmentService;


    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department){
       return departmentService.saveDepartment(department);

    }
}
