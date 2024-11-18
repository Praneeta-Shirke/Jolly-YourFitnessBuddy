package com.JollyPages.Jolly.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userid;
	private String firstname;
	private String lastname;
	private String gmail;
	private String weight;
	private String height;
	private String goal;
	@Transient
	private int otp;
	private Workout workout;
	private Diet diet;
	public int getId() {
		return userid;
	}
	public void setId(int userid) {
		this.userid = userid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getGoal() {
		return goal;
	}
	public void setGoal(String goal) {
		this.goal = goal;
	}
	public int getOtp() {
		return otp;
	}
	public void setOtp(int otp) {
		this.otp = otp;
	}
	public Workout getWorkout() {
		return workout;
	}
	public void setWorkout(Workout workout) {
		this.workout = workout;
	}
	public Diet getDiet() {
		return diet;
	}
	public void setDiet(Diet diet) {
		this.diet = diet;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", firstname=" + firstname + ", lastname=" + lastname + ", gmail=" + gmail
				+ ", weight=" + weight + ", height=" + height + ", goal=" + goal + ", otp=" + otp + ", workout="
				+ workout + ", diet=" + diet + "]";
	}
	public User(int userid, String firstname, String lastname, String gmail, String weight, String height, String goal,
			int otp, Workout workout, Diet diet) {
		super();
		this.userid = userid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.gmail = gmail;
		this.weight = weight;
		this.height = height;
		this.goal = goal;
		this.otp = otp;
		this.workout = workout;
		this.diet = diet;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
