package com.example.SpringPracProg.services;

import com.example.SpringPracProg.entities.Countries;
import com.example.SpringPracProg.repositories.CountriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CountryServiceImpl implements CountryService {

    private final CountriesRepository countriesRepository;

    @Autowired
    public CountryServiceImpl(CountriesRepository countriesRepository) {
        this.countriesRepository = countriesRepository;
    }

    @Override
    public Iterable<Countries> listAllCountriesPaging(Integer pageNr, Integer howManyOnPage) {
        return countriesRepository.findAll(new PageRequest(pageNr, howManyOnPage));
    }

    @Override
    public Iterable<Countries> listAllCountries() {
        return countriesRepository.findAll();
    }

    @Override
    public Optional<Countries> getCountryById(Integer id) {
        return countriesRepository.findById(id);
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
