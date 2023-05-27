package com.example.springcacheredis.service;

import com.example.springcacheredis.model.Student;
import com.example.springcacheredis.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class StudentServiceImpl implements StudentService{


    private final  StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @Override
    @Cacheable("students")
    public List<Student> getStudents() {
       List<Student> students = new ArrayList<>();
        studentRepository.findAll().forEach(students::add);


        try {
            log.info("2 saniye bekleyiniz");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return students;


    }

    @Override
    public Student getStudentByName(String name) {

        try {
            log.info("2 saniye bekleyiniz");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return studentRepository.findByName(name).orElseThrow(() -> new RuntimeException("Kullanici bulunamadi!"));
    }

    @Override
    @CachePut(value = "students", key = "#student.id")
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    @CachePut(value = "students", key = "#student.id")
    public Student updateStudent(Long id, Student student) {
        Optional<Student> optionalStudent = studentRepository.findById(id);
        optionalStudent.ifPresent(value -> student.setId(id));
        return studentRepository.save(student);
    }

    @Override
    @CacheEvict(value = "students", key = "#id", allEntries = true)
    public void deleteStudent(Long id) {
        Optional<Student> optionalStudent = studentRepository.findById(id);

        System.out.println(optionalStudent);
        optionalStudent.ifPresent(value -> studentRepository.deleteById(value.getId()));
    }

    @Override
    @CacheEvict(value = "students", allEntries = true)
    public String clearCache() {
        return "Cache temizlendi";
    }
}
