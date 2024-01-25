package com.jsp.isa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.jsp.isa.dto.EmailDto;

@Service
public class EmailService {
	
	
	@Autowired
	private JavaMailSender javaMailSender;

	public void sendMail(EmailDto dto) {
		try {
			SimpleMailMessage mailMessage = new SimpleMailMessage();	
			mailMessage.setFrom(dto.getFrom());
			mailMessage.setTo(dto.getTo());
			mailMessage.setText(dto.getMsgBody());
			mailMessage.setSubject(dto.getSubject());
			
			javaMailSender.send(mailMessage);
			
		}catch (Exception e) {
			System.out.println("There is some problem");
		}
		
	}
}