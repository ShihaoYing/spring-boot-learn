package com.creamy.cruddemo.dao;

import com.creamy.cruddemo.entity.Student;

public interface StudentDAO {
    void save(Student theStudent);

    Student findById(Integer Id);
}
