package com.ge.smartparking.web.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DashboardController {


	@RequestMapping("/")
	public String dashboard(){
		return "index";
	}

	@RequestMapping("/user")
	public String userdashboard(){
		return "user-dashboard";
	}

	@MessageMapping("/location/spaces")
	@SendTo("/topic/greetings")
	public String greeting(String message) throws Exception {
		Thread.sleep(1000); // simulated delay
		return "Hello, " + message + "!";
	}
}
