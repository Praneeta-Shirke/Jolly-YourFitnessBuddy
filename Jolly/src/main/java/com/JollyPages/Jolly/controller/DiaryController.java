package com.JollyPages.Jolly.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.JollyPages.Jolly.entities.PointsTransaction;
import com.JollyPages.Jolly.entities.User;
import com.JollyPages.Jolly.repositories.PointsTransactionRepository;
import com.JollyPages.Jolly.repositories.UserRepository;
import com.JollyPages.Jolly.services.UserService;

@Controller
public class DiaryController {
	User user;
	UserService userService;
	UserRepository userRepository;
	PointsTransactionRepository pointsTransactionRepository;
	
	@Autowired
	public DiaryController(UserService userService, UserRepository userRepository, PointsTransactionRepository pointsTransactionRepository) {
        this.userService = userService;
        this.userRepository = userRepository;
        this.pointsTransactionRepository=pointsTransactionRepository;
    }

	
	@GetMapping("/diary")
	public String getDiary(){
		return "notes";
	}
	@GetMapping("/leaderboard")
	public String getLeaderboard(Model model) {
		LocalDate now = LocalDate.now();

		// For the day's ranking
		LocalDateTime startOfDay = now.atStartOfDay();
		LocalDateTime endOfDay = startOfDay.plusDays(1).minusSeconds(1);
		List<PointsTransaction> dailyPoints = pointsTransactionRepository.findByTimestampBetween(startOfDay, endOfDay);

		// For the month's ranking
		LocalDateTime startOfMonth = now.withDayOfMonth(1).atStartOfDay();
		LocalDateTime endOfMonth = startOfMonth.plusMonths(1).minusSeconds(1);
		List<PointsTransaction> monthlyPoints = pointsTransactionRepository.findByTimestampBetween(startOfMonth, endOfMonth);
		
		System.out.println("DailyPoints"+dailyPoints);
		System.out.println("MonthlyPoints"+monthlyPoints);
		
		List<User> users = userService.getAllUsersOrderedByPoints();
		model.addAttribute("dailyRanking", dailyPoints);
        model.addAttribute("monthlyRanking", monthlyPoints);
        model.addAttribute("users", users);
		return "leader";
	}
}
