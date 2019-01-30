package com.example.SpringPracProg.services;

import com.example.SpringPracProg.entities.Employees;

public interface EmployeeService {

    Iterable<Employees> listAllEmployees();

    Employees getEmployeeById(Integer id);

    Employees saveEmployee(Employees employee);

    void deleteEmployee(Integer id);

    Boolean checkIfExists(Integer id);

    public Iterable<Employees> listAllEmployeesPaging(Integer pageNr, Integer howManyOnPage);
}
