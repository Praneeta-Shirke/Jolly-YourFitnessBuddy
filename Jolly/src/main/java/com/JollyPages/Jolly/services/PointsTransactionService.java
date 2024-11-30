package com.JollyPages.Jolly.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JollyPages.Jolly.entities.PointsTransaction;
import com.JollyPages.Jolly.entities.User;
import com.JollyPages.Jolly.repositories.PointsTransactionRepository;
import com.JollyPages.Jolly.repositories.UserRepository;

@Service
public class PointsTransactionService {
private PointsTransactionRepository pointsTransactionRepository;
private UserRepository userRepository;
    
    @Autowired
    public PointsTransactionService(PointsTransactionRepository pointsTransactionRepository) {
        this.pointsTransactionRepository = pointsTransactionRepository;
    }

    public List<PointsTransaction> getAllUsersOrderedByPoints() {
        return pointsTransactionRepository.findAllUsersByOrderByPointsDesc();
    }
    
    public PointsTransaction addPointsForInteraction(int userId, int points) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new IllegalArgumentException("User not found with ID: " + userId));

        // Create a new PointsTransaction
        PointsTransaction pointsTransaction = new PointsTransaction();
        pointsTransaction.setPoints(points);
        pointsTransaction.setUser(user);
        pointsTransaction.setTimestamp(LocalDateTime.now());

        // Save the transaction
        return pointsTransactionRepository.save(pointsTransaction);
    }
}
