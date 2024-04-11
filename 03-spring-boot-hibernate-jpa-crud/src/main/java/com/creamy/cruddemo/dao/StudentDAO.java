package com.creamy.cruddemo.dao;

import com.creamy.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {
    void save(Student theStudent);

    Student findById(Integer Id);

    List<Student> findAll();

    List<Student> findByLastName(String lastName);

    void update(Student theStudent);

    void delete(Integer Id);

    int deleteAll();
}
