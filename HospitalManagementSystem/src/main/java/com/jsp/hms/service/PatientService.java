package com.jsp.hms.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.hms.dto.PatientDto;
import com.jsp.hms.entity.Doctordetails;
import com.jsp.hms.entity.Patientdetails;
import com.jsp.hms.repository.PatientRepository;

@Service
public class PatientService {
	
	@Autowired
	private PatientRepository patientRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	private static final Logger LOGGER=LoggerFactory.getLogger(PatientService.class);

	public void addPatient(PatientDto patientDto) 
	{
		Patientdetails map = modelMapper.map(patientDto, Patientdetails.class);
		LOGGER.info("Inside addPatient () of PatientService patientDto {}:" +patientDto);
		patientRepository.save(map);
	}
	
	public List<Patientdetails>getAllPatientdetails()
	{
		List<Patientdetails>patientdetails=patientRepository.findAll();
		LOGGER.info("Inside getAllPatientdetails() of PatientService patientdetails {}:" +patientdetails);
		return patientdetails;
	}
	
	public List<Patientdetails> getPatientByName(String patientName) 
	{
		LOGGER.info("Inside getPatientByName() of PatientService patientName {}:" +patientName);
		return patientRepository.findByName(patientName);
	}
	
	public Patientdetails getByPatientId(Long id)
	{
		LOGGER.info("Inside getByPatientId() of PatientService id {}:" +id);
		return patientRepository.getReferenceById(id);
		
	}
	



	

	

}
