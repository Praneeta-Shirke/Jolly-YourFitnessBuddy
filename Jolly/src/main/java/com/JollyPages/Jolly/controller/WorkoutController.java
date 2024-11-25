package com.JollyPages.Jolly.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.JollyPages.Jolly.entities.Diet;
import com.JollyPages.Jolly.entities.UserLogsSelection;
import com.JollyPages.Jolly.entities.Workout;
import com.JollyPages.Jolly.repositories.DietRepository;
import com.JollyPages.Jolly.repositories.UserLogsSelectionRepository;
import com.JollyPages.Jolly.repositories.WorkoutRepository;
import com.JollyPages.Jolly.services.DietService;
import com.JollyPages.Jolly.services.UserLogsSelectionService;
import com.JollyPages.Jolly.services.UserService;
import com.JollyPages.Jolly.services.WorkoutService;

import java.time.LocalDateTime;
import java.util.List;

@Controller
public class WorkoutController {
	private final DietService dietService;
    private final WorkoutService workoutService;
    private final UserLogsSelectionService userLogsSelectionService;

    @Autowired
    public WorkoutController(DietService dietService, WorkoutService workoutService, UserLogsSelectionService userLogsSelectionService) {
        this.dietService = dietService;
        this.workoutService = workoutService;
        this.userLogsSelectionService = userLogsSelectionService;
    }
    
    // Display the home page with workouts, diets, and logs
    @GetMapping("/home")
    public String showSelection(Model model) {
        List<Diet> diets = dietService.getAllDiets();  // Fetch all diets
        model.addAttribute("diets", diets);

        List<Workout> workouts = workoutService.getAllWorkouts();  // Fetch all workouts
        model.addAttribute("workouts", workouts);

        List<UserLogsSelection> logs = userLogsSelectionService.getAllLogsSorted();  // Fetch all logs
        model.addAttribute("logs", logs);

        return "home"; // Render the "home.html" template
    }

    // Handle log saving
    @PostMapping("/home")
    public String saveLog(@RequestParam int workoutId, @RequestParam int dietId, Model model) {
        // Fetch the selected workout and diet
        Workout workout = workoutService.findById(workoutId);
        Diet diet = dietService.findById(dietId);

        if (workout == null || diet == null) {
            model.addAttribute("error", "Invalid selection. Please try again.");
            return "redirect:/home"; // Redirect to home if there's an error
        }

        // Save the new log entry
        UserLogsSelection log = new UserLogsSelection();
        log.setWorkout(workout);
        log.setDiet(diet);
        log.setTimestamp(LocalDateTime.now());
        userLogsSelectionService.saveLog(log);

        // Update the model with the latest data
        model.addAttribute("workouts", workoutService.getAllWorkouts());
        model.addAttribute("diets", dietService.getAllDiets());
        model.addAttribute("logs", userLogsSelectionService.getAllLogsSorted());
        model.addAttribute("message", "Log added successfully!");

        return "home"; // Stay on the same page
    }}
