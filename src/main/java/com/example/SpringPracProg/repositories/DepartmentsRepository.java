package com.example.SpringPracProg.repositories;

import com.example.SpringPracProg.entities.Departments;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface DepartmentsRepository extends CrudRepository<Departments, Integer>, PagingAndSortingRepository<Departments, Integer> {

    @Query("select count(d) from Departments d where d.id = ?1")
    Integer checkIfExist(Integer id);
}
