package com.jsp.hms.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.hms.dto.DoctorDto;
import com.jsp.hms.entity.Doctordetails;
import com.jsp.hms.repository.DoctorRepository;

@Service
public class DoctorService {
	
	@Autowired
	private DoctorRepository doctorRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	private static final Logger LOGGER=LoggerFactory.getLogger(Doctordetails.class);
	
	public void addDoctor(DoctorDto doctorDto)
	{
		Doctordetails map = modelMapper.map(doctorDto, Doctordetails.class);
		LOGGER.info("Inside addDoctor () of DoctorService DoctorDto {}:" +doctorDto);
		doctorRepository.save(map);
	}
	
	public List<Doctordetails>getAllDoctordetails()
	{
		List<Doctordetails> doctordetails=doctorRepository.findAll();
		LOGGER.info("Inside getAllDoctordetails() of DoctorService Doctordetails {}:" +doctordetails);
		return doctordetails;
		
	}
	public List<Doctordetails>getDoctorByName(String doctorName)
	{
		LOGGER.info("Inside getDoctorByName() of DoctorService doctorName {}:" +doctorName);
		return doctorRepository.findByName(doctorName);
		
	}
	
	public Doctordetails getDoctorById(Long id)
	{
		LOGGER.info("Inside getDoctorById() of DoctorService id{}:" +id);
		return doctorRepository.getReferenceById(id);
	}


}
