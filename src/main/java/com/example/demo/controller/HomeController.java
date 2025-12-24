package com.example.demo.controller;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Domain.Test;
import com.example.demo.Service.TestService;

@Controller
public class HomeController {
	
	private final TestService testService;
	public HomeController(TestService testService) {
		this.testService = testService;
	}
	
	@GetMapping("/")
	public List<Test> Home() {
		return testService.getList();
	}
	
	@GetMapping("/sample")
	public String sample() {
		return "sample";
	}
	
	@PostMapping("/regist")
	public String Regist(Test test) {
		System.out.println(test.getId());
		System.out.println(test.getPw());
		System.out.println(test.getName());
		testService.SaveUser(test);
		return "redirect:/sample";
		
	}
	@GetMapping("/userlist")
	public String UserList(Model model) {
		List<Test> userlist = testService.getList();
		model.addAttribute("userlist", userlist);
		return "UserList";
	}
	@GetMapping("/userdetail")
	public String userDetail(@RequestParam String id, Model model) {
		Test userDetail = testService.getUserDetail(id);
		model.addAttribute("userDetail", userDetail);
		return "UserDetail";
	}
	
}
