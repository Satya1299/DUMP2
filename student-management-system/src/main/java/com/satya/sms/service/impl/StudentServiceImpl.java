 package com.satya.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.satya.sms.entity.Student;
import com.satya.sms.repository.StudentRepository;
import com.satya.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	private StudentRepository studentRepository;
	

	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}


	@Override
	public List<Student> getAllStudents() {
		
		return studentRepository.findAll();
	}

}
