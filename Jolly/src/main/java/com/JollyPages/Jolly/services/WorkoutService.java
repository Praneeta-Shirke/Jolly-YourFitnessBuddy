package com.JollyPages.Jolly.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JollyPages.Jolly.entities.Workout;
import com.JollyPages.Jolly.repositories.WorkoutRepository;

import java.util.List;

@Service
public class WorkoutService {

    private final WorkoutRepository workoutRepository;

    @Autowired
    public WorkoutService(WorkoutRepository workoutRepository) {
        this.workoutRepository = workoutRepository;
    }

    // Method to search workouts by name
    public List<Workout> searchByName(String workoutname) {
        return workoutRepository.findByWorkoutnameContaining(workoutname);
    }

    // Method to search workouts by muscle
    public List<Workout> searchByMuscle(String muscle) {
        return workoutRepository.findByMuscleContaining(muscle);
    }
}
