package com.JollyPages.Jolly.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Workout {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int workoutid;
	private String workoutname;
	private String workouttype;
	private String muscle;
	private String difficulty;
	private String equipment;
	
	public long getWorkoutid() {
		return workoutid;
	}
	public void setWorkoutid(int workoutid) {
		this.workoutid = workoutid;
	}
	public String getEquipment() {
		return equipment;
	}
	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}
	public long getId() {
		return workoutid;
	}
	public void setId(int workoutid) {
		this.workoutid = workoutid;
	}
	public String getWorkoutname() {
		return workoutname;
	}
	public void setWorkoutname(String workoutname) {
		this.workoutname = workoutname;
	}
	public String getWorkouttype() {
		return workouttype;
	}
	public void setWorkouttype(String workouttype) {
		this.workouttype = workouttype;
	}
	public String getMuscle() {
		return muscle;
	}
	public void setMuscle(String muscle) {
		this.muscle = muscle;
	}
	public String getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}
	@Override
	public String toString() {
		return "Workout [workoutid=" + workoutid + ", workoutname=" + workoutname + ", workouttype=" + workouttype
				+ ", muscle=" + muscle + ", difficulty=" + difficulty + ", equipment="
				+ equipment + "]";
	}
	public Workout(int workoutid, String workoutname, String workouttype, String muscle, String difficulty,
			String instruction, String equipment) {
		super();
		this.workoutid = workoutid;
		this.workoutname = workoutname;
		this.workouttype = workouttype;
		this.muscle = muscle;
		this.difficulty = difficulty;
		this.equipment = equipment;
	}
	public Workout() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}






