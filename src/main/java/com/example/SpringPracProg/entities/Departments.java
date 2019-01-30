package com.example.SpringPracProg.entities;

import javax.persistence.*;

@Entity
@Table
public class Departments {

    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "depGen")
    @SequenceGenerator(name = "depGen", sequenceName = "departments_seq")
    private int id;

    @Column(name = "name")
    private String name;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "location", referencedColumnName = "id")
    private Locations location;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String nam) {
        this.name = nam;
    }

    public Locations getLocation() {
        return location;
    }

    public void setLocation(Locations location) {
        this.location = location;
    }
}

