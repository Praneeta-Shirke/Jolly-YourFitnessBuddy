package com.JollyPages.Jolly.entities;

import org.springframework.boot.autoconfigure.web.WebProperties.Resources.Chain.Strategy;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Feedback {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id; 
	private String name;
	private String email;
	private String phoneNo;
	private boolean servicesatisfaction;
	private String suggestion;
	
	public boolean isSatisfied() {
		return servicesatisfaction;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public boolean isServicesatisfaction() {
		return servicesatisfaction;
	}
	public void setServicesatisfaction(boolean servicesatisfaction) {
		this.servicesatisfaction = servicesatisfaction;
	}
	public String getSuggestion() {
		return suggestion;
	}
	public void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
	}
	@Override
	public String toString() {
		return "Feedback [id=" + id + ", name=" + name + ", email=" + email + ", phoneNo=" + phoneNo
				+ ", servicesatisfaction=" + servicesatisfaction + ", suggestion=" + suggestion + "]";
	}
	public Feedback(int id, String name, String email, String phoneNo, boolean servicesatisfaction, String suggestion) {
		super();
		this.id = id;
		name = name;
		this.email = email;
		this.phoneNo = phoneNo;
		this.servicesatisfaction = servicesatisfaction;
		this.suggestion = suggestion;
	}
	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
