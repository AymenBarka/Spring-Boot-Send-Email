package com.example.send.Email.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	
@Id
@GeneratedValue(strategy= GenerationType.AUTO)
private int id;
private String email;

public User() {
	
}
public User(String email, int id) {
	this.email = email;
	this.id = id;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}



}
