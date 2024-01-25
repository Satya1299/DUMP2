package com.jsp.hms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.hms.entity.Doctordetails;

public interface DoctorRepository extends JpaRepository<Doctordetails, Long>{

	List<Doctordetails> findByName(String doctorName);
//	Doctordetails findById();

}
