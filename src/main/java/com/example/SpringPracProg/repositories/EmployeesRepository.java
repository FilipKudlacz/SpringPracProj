package com.example.SpringPracProg.repositories;

import com.example.SpringPracProg.entities.Employees;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EmployeesRepository extends CrudRepository<Employees, Integer>, PagingAndSortingRepository<Employees, Integer> {

    @Query("select count(c) from Countries c where c.id = ?1")
    Integer checkIfExist(Integer id);
}
