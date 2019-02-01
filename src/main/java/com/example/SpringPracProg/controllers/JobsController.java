package com.example.SpringPracProg.controllers;

import com.example.SpringPracProg.entities.Jobs;
import com.example.SpringPracProg.services.JobsService;
import io.swagger.models.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class JobsController {

    @Autowired
    private JobsService jobsService;

    @RequestMapping(value = "jobs", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Jobs> list(Model model) {
        return jobsService.listAllJobs();
    }
}