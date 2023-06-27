package com.example.springapi.service;

import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.web.multipart.MultipartFile;

public class FormWrapper {

        private MultipartFile image;
        private String name;
        private Integer id;

    public FormWrapper(MultipartFile image, String name, Integer id) {
        this.image = image;
        this.name = name;
        this.id = id;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public MultipartFile getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }


}
