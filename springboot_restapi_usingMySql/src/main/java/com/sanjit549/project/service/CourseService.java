package com.sanjit549.project.service;

import java.util.List;

import com.sanjit549.project.Course;

public interface CourseService {
	
	public String upsert(Course course);
	public Course getById(Integer cid);
	public List<Course> getAllCourses();
	public String deleteById(Integer cid);

}
