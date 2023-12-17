package com.sanjit549.com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanjit549.com.model.Student;

public interface StudentDao extends JpaRepository<Student,Integer>{

}
