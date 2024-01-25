package com.satya.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.satya.sms.service.StudentService;



@Controller
public class StudentController {
	
	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	//handler method to handle list students and MVC(Mode and View)
	
	@GetMapping("/students")
	public String listStudents(Model model)
	{
		model.addAttribute("students", studentService.getAllStudents());
		return "students";
		
		
	}

}
