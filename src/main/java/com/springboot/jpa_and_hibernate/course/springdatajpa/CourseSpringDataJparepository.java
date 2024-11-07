package com.springboot.jpa_and_hibernate.course.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.jpa_and_hibernate.course.jdbc.Course;

@Repository
public interface CourseSpringDataJparepository extends JpaRepository<Course, Integer>{
	
	public List<Course> findByAuthor(String author);
	
	public List<Course> findByName(String name);
	
}
