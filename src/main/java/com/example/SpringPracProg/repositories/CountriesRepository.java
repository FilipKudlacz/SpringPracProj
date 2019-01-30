package com.example.SpringPracProg.repositories;

import com.example.SpringPracProg.entities.Countries;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CountriesRepository extends CrudRepository<Countries, Integer>, PagingAndSortingRepository<Countries, Integer> {

    @Query("select count(c) from Countries c where c.id = ?1")
    Integer checkIfExist(Integer id);
}
