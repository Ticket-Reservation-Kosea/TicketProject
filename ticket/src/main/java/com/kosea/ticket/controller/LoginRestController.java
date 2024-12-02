package com.kosea.ticket.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginRestController {
	
	// 비밀번호 재설정
	@PostMapping(value="/resetPw")
	public void resetPw() {
		
	}

}
