package com.kosea.ticket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	// 콘서트 페이지 이동
	@GetMapping(value="/consert")
	public String getConsert() {
		return "consert";
	}
	
	// 콘서트 페이지 이동
	@GetMapping(value="/festival")
	public String getFestival() {
		return "festival";
	}
}
