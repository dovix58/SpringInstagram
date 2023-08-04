package com.example.springapi.api.model;

import jakarta.persistence.*;

@Entity
public class   File {


    @Id
    @Column(name="id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    //id pagrindinis

    private String name;

    public File(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public File() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
