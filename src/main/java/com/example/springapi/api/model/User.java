package com.example.springapi.api.model;

import jakarta.persistence.*;


    @Entity(name = "users")
    public class  User {

        @Id
        @Column(name="id")
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        private Long id;
        //id pagrindinis

        private String name;

        public User(Long id, String name) {
            this.id = id;
            this.name = name;
        }

        public User() {
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


