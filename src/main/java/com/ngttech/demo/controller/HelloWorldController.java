package com.ngttech.demo.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping({ "/hello" })
	public String firstPage(Principal principal) {
		return "Hello : " + principal.getName();
	}

}