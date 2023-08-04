package com.example.springapi.dao;

import com.example.springapi.api.model.File;
import com.example.springapi.api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
}
