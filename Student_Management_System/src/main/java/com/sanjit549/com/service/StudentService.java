package com.sanjit549.com.service;

import java.util.List;

import com.sanjit549.com.entity.Student;

public interface StudentService {
   List<Student> getAllStudents();
   Student saveStudent(Student student) ;
   
   Student getStudentById(long id);
   Student updateStudent(Student student);
   
   void deleteStudentById(Long id);
}
