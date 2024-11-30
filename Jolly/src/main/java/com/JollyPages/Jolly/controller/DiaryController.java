package com.JollyPages.Jolly.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.JollyPages.Jolly.entities.PointsTransaction;
import com.JollyPages.Jolly.entities.User;
import com.JollyPages.Jolly.repositories.PointsTransactionRepository;
import com.JollyPages.Jolly.repositories.UserRepository;
import com.JollyPages.Jolly.services.PointsTransactionService;
import com.JollyPages.Jolly.services.UserService;

@Controller
public class DiaryController {
	User user;
	UserService userService;
	UserRepository userRepository;
	PointsTransactionRepository pointsTransactionRepository;
	PointsTransactionService pointsTransactionService;
	PointsTransaction  pointsTransaction;
	
	@Autowired
	public DiaryController(UserService userService, UserRepository userRepository, PointsTransactionRepository pointsTransactionRepository, PointsTransactionService pointsTransactionService) {
        this.userService = userService;
        this.userRepository = userRepository;
        this.pointsTransactionRepository=pointsTransactionRepository;
        this.pointsTransactionService=pointsTransactionService;
    }

	
	@GetMapping("/diary")
	public String getDiary(){
		return "notes";
	}
	
	@PostMapping("/diary")
	public String handleUserInteraction(@RequestParam("userid")int userid, Model model) {
	    System.out.println("Request received for userId: " + userid);
        pointsTransactionService.addPointsForInteraction(userid, 100);
        model.addAttribute("message", "100 Points added for your hardwork");
        System.out.println("Points added for userId: " + userid);
        return "diary";
	}
	
	
	@GetMapping("/leaderboard")
	public String getLeaderboard(Model model) {
		LocalDate now = LocalDate.now();

		// For the day's ranking
		LocalDateTime startOfDay = now.atStartOfDay();
		LocalDateTime endOfDay = startOfDay.plusDays(1).minusSeconds(1);
		List<PointsTransaction> dailyPoints = pointsTransactionRepository.findByTimestampBetweenWherePointsDesc(startOfDay, endOfDay);

		// For the month's ranking
		LocalDateTime startOfMonth = now.withDayOfMonth(1).atStartOfDay();
		LocalDateTime endOfMonth = startOfMonth.plusMonths(1).minusSeconds(1);
		List<PointsTransaction> monthlyPoints = pointsTransactionRepository.findByTimestampBetweenWherePointsDesc(startOfMonth, endOfMonth);
		
		List<PointsTransaction> log = pointsTransactionService.getAllUsersOrderedByPoints();
		model.addAttribute("dailyRanking", dailyPoints);
        model.addAttribute("monthlyRanking", monthlyPoints);
        model.addAttribute("logs", log);
		return "leader";
	}
}
