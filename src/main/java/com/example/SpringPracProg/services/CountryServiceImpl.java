package com.example.SpringPracProg.services;

import com.example.SpringPracProg.entities.Countries;
import com.example.SpringPracProg.repositories.CountriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;

public class CountryServiceImpl implements CountryService {

    @Autowired
    CountriesRepository countriesRepository;

    @Override
    public Iterable<Countries> listAllCountriesPaging(Integer pageNr, Integer howManyOnPage) {
        return countriesRepository.findAll(new PageRequest(pageNr, howManyOnPage));
    }

    @Override
    public Iterable<Countries> listAllCountries() {
        return countriesRepository.findAll();
    }

    @Override
    public Countries getCountryById(Integer id) {
        return countriesRepository.findById(id).get();
    }

    @Override
    public Countries saveCountry(Countries country) {
        return countriesRepository.save(country);
    }

    @Override
    public void deleteCountry(Integer id) {
        countriesRepository.deleteById(id);
    }

    @Override
    public Boolean checkIfExists(Integer id) {
        return countriesRepository.existsById(id);
    }
}
