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

@Entity
@Table(name = HmsConstant.PATIENT_DETAILS)
@Data
public class Patientdetails implements Serializable{

	@Id
	@GenericGenerator(name="auto", strategy = "increment")
	@GeneratedValue(generator="auto")
	@Column(name="patient_id")
	private Long patient_id;
	@Column(name="name")
	private String name;
	@Column(name="email")
	private String email;
	@Column(name="date_Of_Birth")
	private String date_Of_Birth;
	@Column(name="contact_Number")
	private String contact_Number;
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
	@Column(name="remarks")
	private String remarks; 
	

}
