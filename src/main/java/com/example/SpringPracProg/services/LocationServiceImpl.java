package com.example.SpringPracProg.services;

import com.example.SpringPracProg.entities.Locations;
import com.example.SpringPracProg.repositories.LocationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class LocationServiceImpl implements LocationService {

    @Autowired
    private LocationsRepository locationsRepository;

    @Override
    public Iterable<Locations> listAllLocations() {
        return locationsRepository.findAll();
    }

    @Override
    public Locations getLocationById(Integer id) {
        return locationsRepository.findById(id).get();
    }

    @Override
    public Locations saveLocation(Locations location) {
        return locationsRepository.save(location);
    }

    @Override
    public void deleteLocation(Integer id) {
        locationsRepository.deleteById(id);
    }

    @Override
    public Boolean checkIfExists(Integer id) {
        return locationsRepository.existsById(id);
    }

    @Override
    public Iterable<Locations> listAllLocationsPaging(Integer pageNr, Integer howManyOnPage) {
        return locationsRepository.findAll(new PageRequest(pageNr, howManyOnPage));
    }
}
