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
import com.jsp.hms.dto.DoctorDto;
import com.jsp.hms.entity.Doctordetails;
import com.jsp.hms.service.DoctorService;

@RestController
@RequestMapping(value = HmsConstant.FORWARD_SLASH)
public class DoctorController {
	
	@Autowired
	private DoctorService doctorService;
	private static final Logger LOGGER=LoggerFactory.getLogger(DoctorController.class);
	
	@PostMapping(value = HmsConstant.SAVE_DOCTOR_DETAILS)
	public void addDoctor(@RequestBody DoctorDto doctorDto)
	{
		LOGGER.info("Inside addDoctor () of DoctorController DoctorDto {}:" +doctorDto);
		doctorService.addDoctor(doctorDto);
	}
	@GetMapping(value = HmsConstant.GET_ALL_DOCTOR_DETAILS)
	public @ResponseBody List<Doctordetails> getAllDoctor()
	{
		List<Doctordetails> doctorDetails=doctorService.getAllDoctordetails();
		LOGGER.info("Inside doctorDetails () of DoctorController doctorDetails {}:" +doctorDetails);
		return doctorDetails;
		
	}
	
	@GetMapping(value = HmsConstant.GET_DOCTOR_BY_NAME)
	public List<Doctordetails>getByDoctorName(String doctorName)
	{
		LOGGER.info("Inside getByDoctorName() of DoctorController doctorName {}:" +doctorName);
		return doctorService.getDoctorByName(doctorName);
		
	}
	
	@GetMapping(value = HmsConstant.GET_DOCTOR_BY_ID)
	public Doctordetails getByDoctorId(Long id)
	{
		LOGGER.info("Inside getByDoctorId() of DoctorController id {}:" +id);

		return doctorService.getDoctorById(id);
		
	}
}
