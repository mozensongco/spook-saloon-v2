package com.tts.spookytime.SpookSaloon;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StaffProfile {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String name;
	private String email;
	
	public StaffProfile() {
		
	}
	
	public StaffProfile(String name, String email) {
		
		// Look at filtering homework
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "StaffProfile [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
	
}
