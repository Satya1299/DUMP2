package com.jsp.hms.dto;

import lombok.Data;

@Data
public class PatientDto {
	private Long patient_iD;

	private String name;

	private String email;

	private String date_Of_Birth;

	private String contact_Number;

	private String address;

	private String city;

	private String state;

	private String country;

	private int pinCode;

	private String remarks; 

}
