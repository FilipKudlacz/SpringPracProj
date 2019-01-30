package com.example.SpringPracProg.services;

import com.example.SpringPracProg.entities.Passports;
import com.example.SpringPracProg.repositories.PassportsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.scheduling.support.SimpleTriggerContext;

public class PassportServiceImpl implements PassportService {

    @Autowired
    private PassportsRepository passportsRepository;

    @Override
    public Iterable<Passports> listAllPassports() {
        return passportsRepository.findAll();
    }

    @Override
    public Passports getPassporById(String id) {
        return passportsRepository.findById(id).get();
    }

    @Override
    public Passports savePasspor(Passports passport) {
        return passportsRepository.save(passport);
    }

    @Override
    public void deletePassport(String id) {
        passportsRepository.deleteById(id);
    }

    @Override
    public Boolean checkIfExists(String id) {
        return passportsRepository.existsById(id);
    }

    @Override
    public Iterable<Passports> listAllPassportsPaging(Integer pageNr, Integer howManyOnPage) {
        return passportsRepository.findAll(new PageRequest(pageNr, howManyOnPage));
    }
}
