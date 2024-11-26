//package com.JollyPages.Jolly.entities;
//
//import java.time.LocalDateTime;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
//
//@Entity
//public class UserLogsSelection {
//	
//	    @Id
//	    @GeneratedValue(strategy = GenerationType.IDENTITY)
//	    private int id;
//
//	    @ManyToOne
//	    @JoinColumn(name = "workout_id", nullable = false)
//	    private Workout workout;
//
//	    @ManyToOne
//	    @JoinColumn(name = "diet_id", nullable = false)
//	    private Diet diet;
//
//	    private LocalDateTime timestamp;
//
//		public int getId() {
//			return id;
//		}
//
//		public void setId(int id) {
//			this.id = id;
//		}
//
//		public Workout getWorkout() {
//			return workout;
//		}
//
//		public void setWorkout(Workout workout) {
//			this.workout = workout;
//		}
//
//		public Diet getDiet() {
//			return diet;
//		}
//
//		public void setDiet(Diet diet) {
//			this.diet = diet;
//		}
//
//		public LocalDateTime getTimestamp() {
//			return timestamp;
//		}
//
//		public void setTimestamp(LocalDateTime timestamp) {
//			this.timestamp = timestamp;
//		}
//
//		@Override
//		public String toString() {
//			return "UserLogsSelection [id=" + id + ", workout=" + workout + ", diet=" + diet + ", timestamp="
//					+ timestamp + "]";
//		}
//
//		public UserLogsSelection(int id, Workout workout, Diet diet, LocalDateTime timestamp) {
//			super();
//			this.id = id;
//			this.workout = workout;
//			this.diet = diet;
//			this.timestamp = timestamp;
//		}
//
//		public UserLogsSelection() {
//			super();
//			// TODO Auto-generated constructor stub
//		}
//	    
//	    
//}
