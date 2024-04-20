package com.begin.springboot.learnjpahibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.begin.springboot.learnjpahibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
	
	
	//@Autowired
	// private CourseJdbcRepository repository;
	//@Autowired
	//private CourseJpaRepository  repository;
	
	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		
		//repository.insert(new Course(10,"AWS","cisco"));
		//repository.insert(new Course(11,"Sprin Security","cisco"));
		//repository.insert(new Course(12,"Seleinum","cisco"));
		//repository.deleteById(2);
		//repository.deleteById(10);
		
		repository.save(new Course(2,"CLOUD","META"));
		repository.save(new Course(3,"Aws","Microsoft"));
		
		repository.deleteById(2l);
		
	};
}

