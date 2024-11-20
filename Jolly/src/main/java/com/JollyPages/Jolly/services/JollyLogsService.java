//package com.JollyPages.Jolly.services;
//
//import java.util.List;
//
//import org.springframework.stereotype.Service;
//
//import com.JollyPages.Jolly.entities.Diet;
//import com.JollyPages.Jolly.entities.User;
//import com.JollyPages.Jolly.entities.Workout;
//import com.JollyPages.Jolly.repositories.DietRepository;
//import com.JollyPages.Jolly.repositories.UserRepository;
//import com.JollyPages.Jolly.repositories.WorkoutRepository;
//
//@Service
//public class JollyLogsService {
//	UserRepository jollyrepo;
//	WorkoutRepository workoutrepo;
//	DietRepository dietRepo;
//	
//	
//	
//	public JollyLogsService(UserRepository jollyrepo, WorkoutRepository workoutrepo, DietRepository dietRepo) {
//		this.jollyrepo = jollyrepo;
//		this.workoutrepo = workoutrepo;
//		this.dietRepo = dietRepo;
//	}
//	public List<Workout> getAllWorkouts(){
//		return workoutrepo.findAll();
//	}
//	public List<Diet> getAllDiet(){
//		return dietRepo.findAll();
//	}
//}
