package com.fetutex.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //=(@Controller+@ResponseBody)
public class WelcomeController {
	
	
	@RequestMapping("/mudassir")
	public String helloWorld() {
		
		return "Hello Mudassir"; //"application/json" mean this is a text not a redirect
	}
	
	@RequestMapping("/krishna")
	public String helloWorld(String inputStr) {
		inputStr = "Hello";
		return inputStr.concat(" Krishna"); //"application/json" mean this is a text not a redirect
	}
	
}
