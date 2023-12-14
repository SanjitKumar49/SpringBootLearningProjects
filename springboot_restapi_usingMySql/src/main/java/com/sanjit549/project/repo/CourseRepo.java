package com.sanjit549.project.repo;
import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanjit549.project.Course;


public interface CourseRepo  extends JpaRepository<Course,Serializable>{
	
}
