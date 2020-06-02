package com.aw.auth.authService.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

	@RequestMapping({ "/hello" })
	public String firstPage() {
		return "Hello World";
	}

}
