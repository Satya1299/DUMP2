package com.jsp.hms.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.jsp.hms.constant.HmsConstant;

import lombok.Data;

@Data
@Entity
@Table(name = HmsConstant.DOCTOR_DETAILS)
public class Doctordetails implements Serializable {
	
	@Id
	@GenericGenerator(name="auto", strategy = "increment")
	@GeneratedValue(generator="auto")
	@Column(name="doctor_Id")
	private Long doctor_Id;
	@Column(name="name")
	private String name;
	@Column(name="contact_Number")
	private String contactNumber;
	@Column(name="address")
	private String address;
	@Column(name="city")
	private String city;
	@Column(name="state")
	private String state;
	@Column(name="country")
	private String country;
	@Column(name="pinCode")
	private int pinCode;
	@Column(name="department_Id")
	private int departmentId;
	@Column(name="Specialization_Id")
	private int specializationId;
	
	
	
	

}
