package com.jsp.hms.dto;

import lombok.Data;

@Data
public class DoctorDto {

	private Long doctor_ID;

	private String name;

	private String contactNumber;

	private String address;

	private String city;

	private String state;

	private String country;

	private int pinCode;

	private int departmentId;

	private int specializationId;

}
