package com.example.SpringPracProg.repositories;

import com.example.SpringPracProg.entities.Locations;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface LocationsRepository extends CrudRepository<Locations, Integer>, PagingAndSortingRepository<Locations, Integer> {

    @Query("select count(l) from Locations l where l.id = ?1")
    Integer checkIfExist(Integer id);
}