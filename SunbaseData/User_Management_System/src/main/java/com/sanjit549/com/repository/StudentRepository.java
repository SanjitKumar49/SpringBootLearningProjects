package com.sanjit549.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanjit549.com.entity.Student;


public interface StudentRepository  extends JpaRepository<Student, Long>{

}
