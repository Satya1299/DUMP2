package com.jsp.hms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.jsp.hms.entity.Patientdetails;

public interface PatientRepository extends JpaRepository<Patientdetails, Long> {
	
	List<Patientdetails> findByName(String patientName);
//	Patientdetails findById();
}
