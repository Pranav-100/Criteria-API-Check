package com.ep.emp.controller;

import com.ep.emp.dao.Employee;
import com.ep.emp.dao.EmployeeRequest;
import com.ep.emp.service.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private Services services;

    @GetMapping("/get")
    public List<Employee> getResult(@RequestBody EmployeeRequest employeeRequest) {
        return services.getEmployeeByCriteria(employeeRequest);
    }
}