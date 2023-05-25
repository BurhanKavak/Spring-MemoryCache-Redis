package com.example.springcacheredis.repository;

import com.example.springcacheredis.model.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface StudentRepository extends CrudRepository<Student,Long> {

    Optional<Student> findByName(String name);

}
