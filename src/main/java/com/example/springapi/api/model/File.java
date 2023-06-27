package com.example.springapi.api.model;

import jakarta.persistence.*;

@Entity
public class File {


    @Id
    @Column(name="id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    //id pagrindinis

    private Integer id;
    private String name;

    public File(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public File() {
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
