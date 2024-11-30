package com.JollyPages.Jolly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.JollyPages.Jolly.entities.User;
import com.JollyPages.Jolly.services.PointsTransactionService;
import com.JollyPages.Jolly.services.UserService;



@Controller
public class ProfileController {
	private UserService userservice;
	private User user;
	private PointsTransactionService pointsTransactionService;
	
	public ProfileController(UserService userservice) {
		this.userservice = userservice;
	}
	
	@GetMapping("/signup")
	public String userSignup(Model model) {
		model.addAttribute("user",new User());
		return "signup";
	}
	
	@PostMapping("/signup")
	public String setUser(@ModelAttribute("user") User user) {
		userservice.saveUser(user);
		return "redirect:/signup";
	}
	@GetMapping("/login")
	public String loginform() {
		return "signup";
	}
	@PostMapping("/login")
	public String handleSignup(@ModelAttribute("user") @RequestParam("gmail") String gmail, @RequestParam("password") String ps, Model model,@RequestParam("userid")int userid) {
			
		user = userservice.findByGmail(gmail);

        pointsTransactionService.addPointsForInteraction(userid, 200);
        model.addAttribute("message", "100 Points added for your signup");

		if (gmail == null || gmail.isEmpty() || ps == null || ps.isEmpty()) {
	        model.addAttribute("error", "Please fill out all fields");
	        return "redirect:/signup"; 
	    }

	    if (ps.equals(user.getPassword())) {
	        return "redirect:/";
	    } else {
	        return "redirect:/signup";
	    }
	}
	
}