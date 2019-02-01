package com.example.SpringPracProg.controllers;

import com.example.SpringPracProg.entities.Countries;
import com.example.SpringPracProg.entities.Locations;
import com.example.SpringPracProg.services.LocationService;
import io.swagger.models.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@RestController
@CrossOrigin
public class LocationsController {

    @Autowired
    private LocationService locationService;

    @RequestMapping(value = "locations", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Locations> list(Model model) { return locationService.listAllLocations(); }

    @RequestMapping(value = "location", method = RequestMethod.POST)
    public ResponseEntity<Locations> create(@RequestBody @NotNull @Valid Locations location){
        locationService.saveLocation(location);
        return new ResponseEntity<Locations>(HttpStatus.CREATED);
    }

    @RequestMapping(value = "/location/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        locationService.deleteLocation(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
