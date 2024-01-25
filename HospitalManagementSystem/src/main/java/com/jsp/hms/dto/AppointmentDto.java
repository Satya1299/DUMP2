package com.jsp.hms.dto;

import java.util.Date;

import lombok.Data;

@Data
public class AppointmentDto {
	
	private Long id;

	private Long patientId;

	private Long doctorId;

	private Date date;

	private String time;

	private String isConformed;

	private String prescription;

}
