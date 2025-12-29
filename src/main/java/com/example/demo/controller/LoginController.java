package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.Domain.User;
import com.example.demo.Service.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class LoginController {
	private final UserService userService;
	public LoginController(UserService userService) {
		this.userService = userService;
	}
	@GetMapping("/login")
	public String Login() {
		return "login";
	}
	@PostMapping("/login")
	public String UserLogin(User user, HttpSession session) {
		User userLogined = userService.getUser(user.getId());
		session.setAttribute("user", userLogined);
		return "login";
	}
	@GetMapping("/regist")
	public String SignUp() {
		return "SignUp";
	}
	@PostMapping("/regist")
	public String UserRegist(User user) {
		userService.SignUp(user);
		return "redirect:/login";
	}
	@GetMapping("/global")
	public String Global(HttpSession session) {
		User userLogined = (User)session.getAttribute("user");
		if(userLogined != null) {
			return "login";
		}
		return "BoardList";
	}
	@GetMapping("/admin")
	public String admin() {
		return "admin";
	}
	
}
