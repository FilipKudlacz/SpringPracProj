package com.example.SpringPracProg.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.joda.time.DateTime;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Employees {

    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "empGen")
    @SequenceGenerator(name = "empGen", sequenceName = "employees_see")
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @ManyToOne(fetch = FetchType.LAZY)
    private Jobs jobId;

    @ManyToMany(mappedBy = "subworkers", cascade = CascadeType.ALL)
    private List<Employees> managers = new ArrayList<Employees>();

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Employees> subworkers = new ArrayList<Employees>();

    @ManyToOne(fetch = FetchType.LAZY)
    private Departments department;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "Passport_ID", referencedColumnName = "serial_number")
    Passports passport;

    @Column(name = "registration_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss.SSSZ")
    private DateTime registrationDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Jobs getJobId() {
        return jobId;
    }

    public void setJobId(Jobs jobId) {
        this.jobId = jobId;
    }

    public List<Employees> getManagers() {
        return managers;
    }

    public void setManagers(List<Employees> managers) {
        this.managers = managers;
    }

    public List<Employees> getSubworkers() {
        return subworkers;
    }

    public void setSubworkers(List<Employees> subworkers) {
        this.subworkers = subworkers;
    }

    public Departments getDepartment() {
        return department;
    }

    public void setDepartment(Departments department) {
        this.department = department;
    }

    public DateTime getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(DateTime registrationDate) {
        this.registrationDate = registrationDate;
    }
}