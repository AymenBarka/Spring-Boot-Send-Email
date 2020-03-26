package com.example.send.Email.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.send.Email.entities.User;
import com.example.send.Email.repository.UserRepository;

@Service(value="userService")
public class ServiceUserIMPL implements IServiceUser {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void register(User u) {
       userRepository.save(u);		
	}

	@Override
	public List<User> getAll() {
		List <User> list= new ArrayList<>();
		userRepository.findAll().iterator().forEachRemaining(list::add);
		return list;
	}

	@Override
	public void delete(int id) {
        userRepository.deleteById(id);		
	}

	@Override
	public User findById(int id) {
		return userRepository.findById(id).get();
	}
	
}
