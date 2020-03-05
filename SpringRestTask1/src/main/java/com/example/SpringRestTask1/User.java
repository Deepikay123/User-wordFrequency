package com.example.SpringRestTask1;

import org.springframework.stereotype.Component;

@Component
public class User {
	
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
    //@NotEmpty(message = "First name must not be empty")
	private String name;
	private String email;
	private String about;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	
	
	
	
	
}
