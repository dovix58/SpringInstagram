package com.example.springapi.service;

import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.web.multipart.MultipartFile;

public class FormWrapper {

        private MultipartFile image;
        private String name;
        private Long id;

    public FormWrapper(MultipartFile image, String name, Long id) {
        this.image = image;
        this.name = name;
        this.id = id;
    }

    public MultipartFile getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
