package com.example.SpringPracProg.entities;

import javax.persistence.*;

@Entity
@Table
public class Jobs {

    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "jobsGen")
    @SequenceGenerator(name = "jobsGen", sequenceName = "jobs_seq")
    @Column(name = "id")
    private int id;

    @Column(name = "job_title")
    private String title;

    @Column(name = "max_salary")
    private int maxSalary;

    @Column(name = "min_salary")
    private int minSalary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(int maxSalary) {
        this.maxSalary = maxSalary;
    }

    public int getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(int minSalary) {
        this.minSalary = minSalary;
    }
}