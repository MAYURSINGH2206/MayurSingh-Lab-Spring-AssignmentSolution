package com.gl.StudentCollegeRegistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.StudentCollegeRegistration.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}

