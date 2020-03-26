package com.example.send.Email.service;

import java.util.List;

import com.example.send.Email.entities.User;

public interface IServiceUser {
public void register(User u);
public List<User> getAll();
public void delete(int id);
public User findById(int id);
}
