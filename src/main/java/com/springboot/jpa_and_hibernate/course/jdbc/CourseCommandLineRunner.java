package com.springboot.jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springboot.jpa_and_hibernate.course.jpa.CourseJpaRepository;
import com.springboot.jpa_and_hibernate.course.springdatajpa.CourseSpringDataJparepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{

//	@Autowired
//	private CourseJDBCRepository repository;
	
//	@Autowired
//	private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringDataJparepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		repository.insert(new Course(1,"docker jpa","sri"));
//		repository.insert(new Course(2,"jenkins jpa","leo"));
//		repository.insert(new Course(3,"kubes jpa","sindhu"));
		
		repository.save(new Course(1,"docker data jpa","sri"));
		repository.save(new Course(2,"jenkins data jpa","leo"));
		repository.save(new Course(3,"kubes data jpa","sindhu"));
		
		//repository.deleteById(1);
		
		//System.out.println(repository.findById(2));
		//System.out.println(repository.findById(3));
		
		System.out.println(repository.findAll());
		System.out.println(repository.count());
		
		System.out.println(repository.findByAuthor("leo"));
		
		System.out.println(repository.findByName("kubes data jpa"));
		
	}

}
