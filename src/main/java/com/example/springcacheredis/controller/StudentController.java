package com.example.springcacheredis.controller;

import com.example.springcacheredis.model.Student;
import com.example.springcacheredis.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@Slf4j
public class StudentController {


    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping
    public ResponseEntity<List<Student>> getStudents() {
        log.info("Tum liste getiriliyor...");
        return ResponseEntity.ok(studentService.getStudents());
    }

    @GetMapping("/{name}")
    public ResponseEntity<Student> getStudentByName(@PathVariable("name") String name) {
        log.info("Isim araniyor...");
        return ResponseEntity.ok(studentService.getStudentByName(name));
    }

    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        return new ResponseEntity<>(studentService.createStudent(student), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable("id") Long id,@RequestBody Student student) {
        log.info("Guncellenen person Id'si : {}",id);
        return new ResponseEntity<>(studentService.updateStudent(id,student),HttpStatus.ACCEPTED);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable("id") Long id) {
        studentService.deleteStudent(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/cacheClear")
    public ResponseEntity<String> clearCache() {
       return new ResponseEntity<>(studentService.clearCache(),HttpStatus.NO_CONTENT);

    }


}
