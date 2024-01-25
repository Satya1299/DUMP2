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
@Table(name = HmsConstant.FORWARD_SLASH)
@Data
public class Testdetails implements Serializable {
	@Id
	@GenericGenerator(name = "auto",strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name = "id")
	private Long id;
	@Column(name = "patient_Id")
	private Long patient_Id;
	@Column(name = "name")
	private String name;
	@Column(name = "date")
	private String date;
	@Column(name = "doctor_Id")
	private Long doctor_Id;
	@Column(name = "remarks")
	private String remarks;

	

}
