package com.kosea.ticket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
	
	// 일반 로그인 (localLogin)
	
	// 소셜 로그인 (socialLogin)
	
	// 아이디 찾기
	@PostMapping(value = "/findId")
	public String findId() {
		return "";
	}
	
	// 비밀번호 재설정 페이지 조회
	@GetMapping(value = "/resetPw")
	public String getResetPw() {
		return "";
	}
	
}
