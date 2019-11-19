package com.example.hakusai_flight;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;

@Controller
//@RequestMapping("/api")
public class HelloController {

	@GetMapping("/")
	public String homePage(){
		return "homepage";
	}



	@GetMapping("/byebye")
	public String byebye() {
		return "byebye";
	}

	@GetMapping("/say")
	public String hello() {
		return "Hello Spring Boot";

	}

	@GetMapping("/bye")
	public String bye() {
		return "bye";
	}
}
