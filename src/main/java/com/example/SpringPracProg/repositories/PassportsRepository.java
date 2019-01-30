package com.example.SpringPracProg.repositories;

import com.example.SpringPracProg.entities.Passports;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PassportsRepository extends CrudRepository<Passports, String>, PagingAndSortingRepository<Passports, String> {

    @Query("select count(c) from Passports c where c.serialNumber = ?1")
    String checkIfExist(String id);
}
