package com.satya.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.satya.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
