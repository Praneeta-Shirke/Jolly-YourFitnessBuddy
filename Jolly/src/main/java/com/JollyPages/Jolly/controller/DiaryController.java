package com.JollyPages.Jolly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DiaryController {
	@GetMapping("/diary")
	public String getDiary(){
		return "notes";
	}
	@GetMapping("/leaderboard")
	public String getLeaderboard() {
		return "leader";
	}
}
