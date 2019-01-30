package com.example.SpringPracProg.entities;

import javax.persistence.*;

@Entity
@Table
public class Countries {

    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "couGen")
    @SequenceGenerator(name = "couGen", sequenceName = "countries_seq")
    private int id;

    @Column
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}