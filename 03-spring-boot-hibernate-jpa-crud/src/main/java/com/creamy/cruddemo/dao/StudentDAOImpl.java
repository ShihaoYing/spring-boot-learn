package com.creamy.cruddemo.dao;

import com.creamy.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO{

    // define field for entity manager
    private final EntityManager entityManager;

    // inject entity manager
    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    // implement save method
    @Override
    @Transactional
    public void save(Student theStudent) {
        entityManager.persist(theStudent);
    }

    @Override
    public Student findById(Integer Id) {
        return entityManager.find(Student.class, Id);
    }

    @Override
    public List<Student> findAll() {
        // create query
        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student", Student.class);

        // return query result
        return theQuery.getResultList() ;
    }

    @Override
    public List<Student> findByLastName(String lastName) {
        // create query
        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student WHERE lastName =:theLastName", Student.class);

        // set parameter
        theQuery.setParameter("theLastName", lastName);

        // return result
        return theQuery.getResultList();
    }

    @Override
    @Transactional
    public void update(Student theStudent) {
        entityManager.merge(theStudent);
    }

    @Override
    @Transactional
    public void delete(Integer Id) {
        Student tempStudent = entityManager.find(Student.class, Id);
        entityManager.remove(tempStudent);
    }

    @Override
    @Transactional
    public int deleteAll() {
        int rowDeleted = entityManager.createQuery("delete from Student").executeUpdate();
        return rowDeleted;
    }
}
