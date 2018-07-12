package com.gaia3d.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/hello")
@Controller
public class HelloWorldController {

	@GetMapping("/hello")
	public String sayHello(Map<String, Object> model) {
		System.out.println("@@@@@@@@@@@@@@@@@@@@");
		model.put("message", "안녕하세요");
		return "/hello/hello";
	}
}
