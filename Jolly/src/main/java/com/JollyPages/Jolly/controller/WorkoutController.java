package com.JollyPages.Jolly.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.JollyPages.Jolly.entities.Diet;
import com.JollyPages.Jolly.entities.Workout;
import com.JollyPages.Jolly.services.DietService;
import com.JollyPages.Jolly.services.WorkoutService;

import java.util.List;

@Controller
public class WorkoutController {
	private final DietService dietService;
    private final WorkoutService workoutService;
    
    @Autowired
    public WorkoutController(DietService dietService, WorkoutService workoutService) {
        this.dietService = dietService;
        this.workoutService = workoutService;
    }
    
    @GetMapping("/home")
    public String showSelection(Model model) {
        List<Diet> diets = dietService.getAllDiets();  // Fetch all diets
        model.addAttribute("diets", diets);

        List<Workout> workouts = workoutService.getAllWorkouts();  // Fetch all workouts
        model.addAttribute("workouts", workouts);

        return "home"; 
    }
}