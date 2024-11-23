package com.JollyPages.Jolly.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;

import com.JollyPages.Jolly.entities.User;
import com.JollyPages.Jolly.services.UserService;

import com.JollyPages.Jolly.entities.User;
import com.JollyPages.Jolly.services.OtpService;
import com.JollyPages.Jolly.services.UserService;



@Controller
public class ProfileController {
	private UserService userservice;
	private User user;
	
	public ProfileController(UserService userservice) {
		this.userservice = userservice;
	}
	
	@GetMapping("/signup")
	public String userSignup(Model model) {
		model.addAttribute("user",new User());
		System.out.println("Gmail : "+user.getGmail());
		System.out.println("password : "+user.getPassword());
		return "signup";
	}
	
	@PostMapping("/signup")
	public String setUser(@ModelAttribute("user") User user) {
		userservice.saveUser(user);
		return "redirect:/login";
	}
	@GetMapping("/login")
	public String loginform() {
		return "login";
	}
	@PostMapping("/login")
	public String handleSignup(@RequestParam("gmail") String us, @RequestParam("password") String ps, Model model) {
			
			String gmail = user.getGmail();
			String password = user.getPassword();
			if(us.equals(gmail)&&ps.equals(password)) {
				return "redirect:/Home";
			}else {
				model.addAttribute("error","Invalid username or password");
				return "signup";
			}
	}
}

