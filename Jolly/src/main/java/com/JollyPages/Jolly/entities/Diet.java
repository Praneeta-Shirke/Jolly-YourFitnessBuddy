package com.JollyPages.Jolly.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Diet {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int dietid;
	private String dietname;
	private float calories;
	private float serving;
	private float fats;
	private float saturatedfats;
	private float protein;
	private float sodium;
	private float potassium;
	private float cholesterol;
	private float carbs;
	private float fiber;
	private float sugar;
	
	public int getDietid() {
		return dietid;
	}
	public void setDietid(int dietid) {
		this.dietid = dietid;
	}
	public String getDietname() {
		return dietname;
	}
	public void setDietname(String dietname) {
		this.dietname = dietname;
	}
	
	public float getCalories() {
		return calories;
	}
	public void setCalories(float calories) {
		this.calories = calories;
	}
	public float getServing() {
		return serving;
	}
	public void setServing(float serving) {
		this.serving = serving;
	}
	public float getFats() {
		return fats;
	}
	public void setFats(float fats) {
		this.fats = fats;
	}
	public float getSaturatedfats() {
		return saturatedfats;
	}
	public void setSaturatedfats(float saturatedfats) {
		this.saturatedfats = saturatedfats;
	}
	public float getProtein() {
		return protein;
	}
	public void setProtein(float protein) {
		this.protein = protein;
	}
	public float getSodium() {
		return sodium;
	}
	public void setSodium(float sodium) {
		this.sodium = sodium;
	}
	public float getPotassium() {
		return potassium;
	}
	public void setPotassium(float potassium) {
		this.potassium = potassium;
	}
	public float getCholesterol() {
		return cholesterol;
	}
	public void setCholesterol(float cholesterol) {
		this.cholesterol = cholesterol;
	}
	public float getCarbs() {
		return carbs;
	}
	public void setCarbs(float carbs) {
		this.carbs = carbs;
	}
	public float getFiber() {
		return fiber;
	}
	public void setFiber(float fiber) {
		this.fiber = fiber;
	}
	public float getSugar() {
		return sugar;
	}
	public void setSugar(float sugar) {
		this.sugar = sugar;
	}
	@Override
	public String toString() {
		return "Diet [dietid=" + dietid + ", dietname=" + dietname + ", calories=" + calories
				+ ", serving=" + serving + ", fats=" + fats + ", saturatedfats=" + saturatedfats + ", protein="
				+ protein + ", sodium=" + sodium + ", potassium=" + potassium + ", cholesterol=" + cholesterol
				+ ", carbs=" + carbs + ", fiber=" + fiber + ", sugar=" + sugar + "]";
	}
	public Diet(int dietid, String dietname, String name, float calories, float serving, float fats,
			float saturatedfats, float protein, float sodium, float potassium, float cholesterol, float carbs,
			float fiber, float sugar) {
		super();
		this.dietid = dietid;
		this.dietname = dietname;
		this.calories = calories;
		this.serving = serving;
		this.fats = fats;
		this.saturatedfats = saturatedfats;
		this.protein = protein;
		this.sodium = sodium;
		this.potassium = potassium;
		this.cholesterol = cholesterol;
		this.carbs = carbs;
		this.fiber = fiber;
		this.sugar = sugar;
	}
	public Diet() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
