package com.kosea.ticket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	// �ܼ�Ʈ ������ �̵�
	@GetMapping(value="/consert")
	public String getConsert() {
		return "consert";
	}
	
	// �ܼ�Ʈ ������ �̵�
	@GetMapping(value="/festival")
	public String getFestival() {
		return "festival";
	}
}
