package com.example.SpringPracProg.controllers;

import com.example.SpringPracProg.entities.Passports;
import com.example.SpringPracProg.services.PassportService;
import io.swagger.models.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class PassportsController {

    @Autowired
    private PassportService passportService;

    @RequestMapping(value = "passports", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Passports> list(Model model) {
        return passportService.listAllPassports();
    }

    @RequestMapping(value = "/location/{serialNumber}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> delete(@PathVariable String serialNumber) {
        passportService.deletePassport(serialNumber);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
