package com.cgi.springdata.jpa.tutorial.repository;

import com.cgi.springdata.jpa.tutorial.entity.Course;
import com.cgi.springdata.jpa.tutorial.entity.CourseMaterial;
import com.cgi.springdata.jpa.tutorial.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseMaterialRepositoryTest {

    @Autowired
    private CourseMaterialRepository courseMaterialRepository;

    @Test
    void saveCourseMaterial() {

        Course course = Course.builder().
                titile("DSA").
                credit(6).
                build();


        CourseMaterial courseMaterial = CourseMaterial.builder().
                course(course)
                .url("www.google.com")
                .build();

        courseMaterialRepository.save(courseMaterial);
    }

    @Test
    void printAllCourseMaterial(){
        List<CourseMaterial> all = courseMaterialRepository.findAll();
        System.out.println(all);
    }

}