package com.jsp.hms.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.hms.constant.HmsConstant;
import com.jsp.hms.dto.PatientDto;
import com.jsp.hms.entity.Doctordetails;
import com.jsp.hms.entity.Patientdetails;

import com.jsp.hms.service.PatientService;

@RestController
@RequestMapping(value = HmsConstant.FORWARD_SLASH)
public class PatientController {
	
	@Autowired
	private PatientService patientService;
	private static final Logger LOGGER=LoggerFactory.getLogger(PatientController.class);
	
	@PostMapping(value = HmsConstant.SAVE_PATIENT_DETAILS)
	public void addPatient(PatientDto patientDto)
	{
		LOGGER.info("Inside addPatient() of PatientController patientDto {}:" +patientDto);
		patientService.addPatient(patientDto);
		
	}
	@GetMapping(value = HmsConstant.GET_ALL_PATIENT_DETAILS )
	public List<Patientdetails>getAllPatient()
	{
		List<Patientdetails> patientDetails=patientService.getAllPatientdetails();
		LOGGER.info("Inside getAllPatient() of PatientController patientDetails {}:" +patientDetails);
		return patientDetails;
		
	}
	
	@GetMapping(value = HmsConstant.GET_PATENT_BY_NAME)
	public List<Patientdetails>getPatientByName(String patientName)
	{
		LOGGER.info("Inside getPatientByName() of PatientController patientName {}:" +patientName);
		return patientService.getPatientByName(patientName);
		
	}
	
	@GetMapping(value = HmsConstant.GET_PATIENT_BY_ID)
	public Patientdetails getPatientById(Long id)
	{
		LOGGER.info("Inside getPatientById() of PatientController id {}:" +id);
		return patientService.getByPatientId(id);
		
	}


}
