package com.example.SpringPracProg.repositories;

import com.example.SpringPracProg.entities.Jobs;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface JobsRepository extends CrudRepository<Jobs, Integer>, PagingAndSortingRepository<Jobs, Integer> {

    @Query("select count(j) from Jobs j where j.id = ?1")
    Integer checkIfExist(Integer id);
}
