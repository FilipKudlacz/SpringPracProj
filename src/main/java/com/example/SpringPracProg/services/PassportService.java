package com.example.SpringPracProg.services;

import com.example.SpringPracProg.entities.Passports;

public interface PassportService {

    Iterable<Passports> listAllPassports();

    Passports getPassporById(String id);

    Passports savePasspor(Passports passport);

    void deletePassport(String id);

    Boolean checkIfExists(String id);

    public Iterable<Passports> listAllPassportsPaging(Integer pageNr, Integer howManyOnPage);
}
