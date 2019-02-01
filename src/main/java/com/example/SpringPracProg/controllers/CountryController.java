package com.example.SpringPracProg.controllers;

import com.example.SpringPracProg.entities.Countries;
import com.example.SpringPracProg.services.CountryService;
import io.swagger.models.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@CrossOrigin
@RestController
public class CountryController {
    @Autowired
    private CountryService countryService;

    @RequestMapping(value = "countries", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Countries> list(Model model) { return countryService.listAllCountries(); }

    @RequestMapping(value = "country", method = RequestMethod.POST)
    public ResponseEntity<Countries> create(@RequestBody @NotNull @Valid Countries country){
        countryService.saveCountry(country);
        return new ResponseEntity<Countries>(HttpStatus.CREATED);
    }

    @RequestMapping(value = "/country/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        countryService.deleteCountry(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
