package com.begin.springboot.learnjpahibernate.course.springdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.begin.springboot.learnjpahibernate.course.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {

}
