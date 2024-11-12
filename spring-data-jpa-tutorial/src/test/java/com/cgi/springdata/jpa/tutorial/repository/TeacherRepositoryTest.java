package com.cgi.springdata.jpa.tutorial.repository;

import com.cgi.springdata.jpa.tutorial.entity.Course;
import com.cgi.springdata.jpa.tutorial.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TeacherRepositoryTest {

    @Autowired
    private TeacherRepository teacherRepository;


    @Test
    void saveTeacher(){

        Course courseDBA = Course.builder().
                titile("DBA").
                credit(5).
                build();

        Course courseJAVA = Course.builder().
                titile("JAVA").
                credit(4).
                build();

        Teacher teacher = Teacher.builder().
                firstName("Qutub").
                lastName("khan").
//                courses(List.of(courseDBA,courseJAVA)).
                build();

        teacherRepository.save(teacher);
    }
}