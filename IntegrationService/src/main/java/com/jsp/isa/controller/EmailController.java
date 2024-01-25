package com.jsp.isa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.isa.constant.IntegrationConstant;
import com.jsp.isa.dto.EmailDto;
import com.jsp.isa.service.EmailService;

@RestController
@RequestMapping(value = IntegrationConstant.EMAIL)
public class EmailController {
	
	@Autowired
	private EmailService emailService;
	
	@PostMapping(value = IntegrationConstant.PROCESS_MAIL)
	public void processMail(@RequestBody EmailDto dto)
	{
		emailService.sendMail(dto);
	}
}

