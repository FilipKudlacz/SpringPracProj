package com.example.SpringPracProg.services;

import com.example.SpringPracProg.entities.Employees;
import com.example.SpringPracProg.repositories.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeesRepository employeesRepository;

    @Override
    public Iterable<Employees> listAllEmployees() {
        return employeesRepository.findAll();
    }

    @Override
    public Employees getEmployeeById(Integer id) {
        return employeesRepository.findById(id).get();
    }

    @Override
    public Employees saveEmployee(Employees employee) {
        return employeesRepository.save(employee);
    }

    @Override
    public void deleteEmployee(Integer id) {
        employeesRepository.deleteById(id);
    }

    @Override
    public Boolean checkIfExists(Integer id) {
        return employeesRepository.existsById(id);
    }

    @Override
    public Iterable<Employees> listAllEmployeesPaging(Integer pageNr, Integer howManyOnPage) {
        return employeesRepository.findAll(new PageRequest(pageNr, howManyOnPage));
    }
}
