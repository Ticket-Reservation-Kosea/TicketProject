package com.kosea.ticket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
	
	// �Ϲ� �α��� (localLogin)
	
	// �Ҽ� �α��� (socialLogin)
	
	// ���̵� ã��
	@PostMapping(value = "/findId")
	public String findId() {
		return "";
	}
	
	// ��й�ȣ �缳�� ������ ��ȸ
	@GetMapping(value = "/resetPw")
	public String getResetPw() {
		return "";
	}
	
}
