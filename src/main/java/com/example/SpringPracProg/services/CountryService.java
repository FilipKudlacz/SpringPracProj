package com.example.SpringPracProg.services;

import com.example.SpringPracProg.entities.Countries;

public interface CountryService {

    Iterable<Countries> listAllCountries();

    Countries getCountryById(Integer id);

    Countries saveCountry(Countries country);

    void deleteCountry(Integer id);

    Boolean checkIfExists(Integer id);

    public Iterable<Countries> listAllCountriesPaging(Integer pageNr, Integer howManyOnPage);
}
