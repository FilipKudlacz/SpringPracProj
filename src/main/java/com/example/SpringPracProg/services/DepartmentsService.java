package com.example.SpringPracProg.services;

import com.example.SpringPracProg.entities.Departments;

public interface DepartmentsService {

    Iterable<Departments> listAllDepartments();

    Departments getDepartmentsById(Integer id);

    Departments saveDepartment(Departments department);

    void deleteDepartment(Integer id);

    Boolean checkIfExists(Integer id);

    public Iterable<Departments> listAllDepartmentsPaging(Integer pageNr, Integer howManyOnPage);
}
