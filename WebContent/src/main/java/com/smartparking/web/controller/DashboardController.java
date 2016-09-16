package com.smartparking.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DashboardController {

	
	@RequestMapping("/")
	public String dashboard(){
		return "index.home";
	}
}
