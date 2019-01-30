package com.example.SpringPracProg.services;

import com.example.SpringPracProg.entities.Departments;
import com.example.SpringPracProg.repositories.DepartmentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;

public class DepartmentsServiceImpl implements DepartmentsService {

    @Autowired
    private DepartmentsRepository departmentsRepository;

    @Override
    public Iterable<Departments> listAllDepartments() {
        return departmentsRepository.findAll();
    }

    @Override
    public Departments getDepartmentsById(Integer id) {
        return departmentsRepository.findById(id).get();
    }

    @Override
    public Departments saveDepartment(Departments department) {
        return departmentsRepository.save(department);
    }

    @Override
    public void deleteDepartment(Integer id) {
        departmentsRepository.deleteById(id);
    }

    @Override
    public Boolean checkIfExists(Integer id) {
        return departmentsRepository.existsById(id);
    }

    @Override
    public Iterable<Departments> listAllDepartmentsPaging(Integer pageNr, Integer howManyOnPage) {
        return departmentsRepository.findAll(new PageRequest(pageNr, howManyOnPage));
    }
}
