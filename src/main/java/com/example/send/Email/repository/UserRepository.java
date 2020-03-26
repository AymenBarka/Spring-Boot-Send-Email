package com.example.send.Email.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.send.Email.entities.User;


public interface UserRepository extends JpaRepository<User, Integer> {

}
