package com.JollyPages.Jolly.entities;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

public class Workout {
	private int workoutid;
	private String workoutname;
	private String workouttype;
	private String muscle;
	private String difficulty;
	private String instruction;
	private LocalDate inputdate;
	private LocalTime inputtime;
	public int getId() {
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
	public String getInstruction() {
		return instruction;
	}
	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}
	public LocalDate getInputdate() {
		return inputdate;
	}
	public void setInputdate(LocalDate inputdate) {
		this.inputdate = inputdate;
	}
	public LocalTime getInputtime() {
		return inputtime;
	}
	public void setInputtime(LocalTime inputtime) {
		this.inputtime = inputtime;
	}
	@Override
	public String toString() {
		return "Workout [workoutid=" + workoutid + ", workoutname=" + workoutname + ", workouttype=" + workouttype + ", muscle="
				+ muscle + ", difficulty=" + difficulty + ", instruction=" + instruction + ", inputdate=" + inputdate
				+ ", inputtime=" + inputtime + "]";
	}
	public Workout(int workoutid, String workoutname, String workouttype, String muscle, String difficulty, String instruction,
			LocalDate inputdate, LocalTime inputtime) {
		super();
		this.workoutid = workoutid;
		this.workoutname = workoutname;
		this.workouttype = workouttype;
		this.muscle = muscle;
		this.difficulty = difficulty;
		this.instruction = instruction;
		this.inputdate = inputdate;
		this.inputtime = inputtime;
	}
	public Workout() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
