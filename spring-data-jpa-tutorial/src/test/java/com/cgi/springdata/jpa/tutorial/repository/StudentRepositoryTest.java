package com.cgi.springdata.jpa.tutorial.repository;

import com.cgi.springdata.jpa.tutorial.entity.CourseMaterial;
import com.cgi.springdata.jpa.tutorial.entity.Guardian;
import com.cgi.springdata.jpa.tutorial.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class StudentRepositoryTest {
    @Autowired
    private StudentRepository studentRepository;

    @Test
    void saveStudent() {
        Student student = Student.builder().
                email("shiva@gmail.com").
                firstName("shiva").
                lastName("kundan").
//                guardianName("Rama").
//                guardianEmail("Rama@gmail.com").
//                guardianMobile("9876543123").
        build();

        studentRepository.save(student);

    }

    @Test
    void saveStudentWithGuardian() {
        Guardian guardian = Guardian.builder().
                email("nikhil@gmail,com").
                name("nikhil").
                mobile("987654321").
                build();

        Student student = Student.builder().
                firstName("shivam").
                email("shivam@gmail.com").
                lastName("kumar").
                guardian(guardian).
                build();
        studentRepository.save(student);
    }

    @Test
    void printAllStudent() {
        List<Student> studentList =
                studentRepository.findAll();
        System.out.println("studentList = " + studentList);

    }

    @Test
    void printStudentByFirstName() {
        List<Student> students = studentRepository.findByFirstName("shivam");
        System.out.println("students = " + students);
    }

    @Test
    void printStudentByfirstNameContaining() {
        List<Student> sh = studentRepository.findByfirstNameContaining("sh");
        System.out.println(sh);
    }

    @Test
    void printStudentBasedOnGuardianName() {
        List<Student> nikhil = studentRepository.findByGuardianName("nikhil");
        System.out.println("students = " + nikhil);
    }

    @Test
    void printStudentFirstAndLastName(){
        Student byFirstNameAndLastName = studentRepository.findByFirstNameAndLastName("shiva", "kundan");
        System.out.println("student = "+byFirstNameAndLastName);
    }

    @Test
    void printGetStudentByEmailAddress(){
        Student student = studentRepository.getStudentByEmailAddress("shivam@gmail.com");
        System.out.println("student = "+student);
    }

    @Test
    void printStudentFirstNameByEmailAddress(){
        String studentFirstNameByEmailAddress = studentRepository.getStudentFirstNameByEmailAddress("shiva@gmail.com");
        System.out.println("student = "+studentFirstNameByEmailAddress);
    }

    @Test
    void printGetStudentByEmailAddressNative(){
        Student studentByEmailAdsressNative = studentRepository.getStudentByEmailAdsressNative("shivam@gmail.com");
        System.out.println("student = "+studentByEmailAdsressNative);
    }

    @Test
    void pritnGetStudentByEmailAddresNativeNamedParam(){

        System.out.println(studentRepository.getStudentByEmailAddressNativeNamedParam("shivam@gmail.com"));
    }

    @Test
    void printUpdateStudentByEmailId(){

        System.out.println(studentRepository.updateStudentByEmailId("shivam dube",
                "shivam@gmail.com"));
    }



}