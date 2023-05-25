package com.example.springcacheredis.service;

import com.example.springcacheredis.model.Student;

import java.util.List;

public interface StudentService {

    List<Student> getStudents();

    Student getStudentByName(String name);

    Student createStudent(Student student);

    Student updateStudent(Long id, Student student);

    void deleteStudent(Long id);


    String clearCache();


}
