package com.begin.springboot.learnjpahibernate.course.jpa;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.begin.springboot.learnjpahibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
@Transactional // Add this annotation to enable transactional support
public class CourseJpaRepository {
	
 
	@PersistenceContext
    private EntityManager entityManager;
	//auto wire - not good practice here
	// allows dependency injection using entity manager
	public void insert(Course course) {
		entityManager.merge(course);
	}
	public Course findById(long id) {
		return entityManager.find(Course.class,id);
	}
	public void deleteById(long id) {
		Course course = entityManager.find(Course.class,id);// find the course then fire the deletion query
		entityManager.remove(course);
	}
	
}
