package com.example.SpringPracProg.controllers;

import com.example.SpringPracProg.entities.Employees;
import com.example.SpringPracProg.services.EmployeeService;
import io.swagger.models.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class EmployeesController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "employees", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Employees> list(Model model) {
        return employeeService.listAllEmployees();
    }

}
