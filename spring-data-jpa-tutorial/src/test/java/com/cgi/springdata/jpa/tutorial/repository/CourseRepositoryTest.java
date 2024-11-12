package com.cgi.springdata.jpa.tutorial.repository;

import com.cgi.springdata.jpa.tutorial.entity.Course;
import com.cgi.springdata.jpa.tutorial.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CourseRepositoryTest {

    @Autowired
    private CourseRepository courseRepository;

    @Test
    void printCourses(){
        List<Course> all = courseRepository.findAll();
        System.out.println(all);

    }

    @Test
    void saveCourseWithTeacher(){
        Teacher teacher = Teacher.builder().
                firstName("priyanka").
                lastName("singh").
                build();


        Course course=Course.builder().
                titile("pyhton").
                credit(6).
                teacher(teacher).
                build();

        courseRepository.save(course);

    }

}