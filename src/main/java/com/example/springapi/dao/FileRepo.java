package com.example.springapi.dao;

import com.example.springapi.api.model.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.events.Event;

public interface FileRepo extends JpaRepository<File, Integer> {
}
