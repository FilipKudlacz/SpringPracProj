package com.example.SpringPracProg.controllers;

import com.example.SpringPracProg.entities.Departments;
import com.example.SpringPracProg.services.DepartmentsService;
import io.swagger.models.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class DepartmentsController {

    @Autowired
    private DepartmentsService departmentsService;

    @RequestMapping(value = "departments", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Departments> list(Model model) {
        return departmentsService.listAllDepartments();
    }
}