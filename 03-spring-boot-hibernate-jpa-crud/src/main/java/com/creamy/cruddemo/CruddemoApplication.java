package com.creamy.cruddemo;

import com.creamy.cruddemo.dao.StudentDAO;
import com.creamy.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){

		return runner->{
			//createStudent(studentDAO);
//			createMultipleStudent(studentDAO);
			readStudent(studentDAO);
		};
	}

	private void readStudent(StudentDAO studentDAO) {
		// create a student object
		System.out.println("Creating student ...");
		Student tempStudent = new Student("Yuki", "Zhang", "abce@gmail.com");

		// save the student
		System.out.println("Saving the student...");
		studentDAO.save(tempStudent);

		// display id
		int theId = tempStudent.getId();
		System.out.println("Getting the student with id " + theId);

		// retrieve student based on the id
		System.out.println("Retrieving the student with id " + theId);
		Student myStudent = studentDAO.findById(theId);

		// display student
		System.out.println("Found the student: "+myStudent);
	}

	private void createMultipleStudent(StudentDAO studentDAO) {
		System.out.println("Creating 5 student ...");
		Student tempStudent1 = new Student("Yuki1", "Zhang", "abce@gmail.com");
		Student tempStudent2 = new Student("Yuki2", "Zhan", "abce@gmail.com");
		Student tempStudent3 = new Student("Yuki3", "Zha", "abce@gmail.com");
		Student tempStudent4 = new Student("Yuki4", "Zh", "abce@gmail.com");
		Student tempStudent5 = new Student("Yuki5", "Z", "abce@gmail.com");

		System.out.println("Saving the student...");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);
		studentDAO.save(tempStudent4);
		studentDAO.save(tempStudent5);
	}

	private void createStudent(StudentDAO studentDAO) {
		// create the student object
		System.out.println("Creating student ...");
		Student tempStudent = new Student("Yuki", "Zhang", "abce@gmail.com");

		// save the student object
		System.out.println("Saving the student...");
		studentDAO.save(tempStudent);

		// display id of the saved student
		System.out.println("Saved student. Generated id: "+ tempStudent.getId());
	}

}
