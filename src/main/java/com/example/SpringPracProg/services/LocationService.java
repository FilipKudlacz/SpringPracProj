package com.example.SpringPracProg.services;

import com.example.SpringPracProg.entities.Locations;

public interface LocationService {

    Iterable<Locations> listAllLocations();

    Locations getLocationById(Integer id);

    Locations saveLocation(Locations location);

    void deleteLocation(Integer id);

    Boolean checkIfExists(Integer id);

    public Iterable<Locations> listAllLocationsPaging(Integer pageNr, Integer howManyOnPage);

}
