package com.cgi.springdata.jpa.tutorial.repository;

import com.cgi.springdata.jpa.tutorial.entity.Student;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    public List<Student> findByFirstName(String firstName);

    public List<Student> findByfirstNameContaining(String name);

    public List<Student> findByLastNameNotNull();

    List<Student> findByGuardianName(String guardianName);

    Student findByFirstNameAndLastName(String firstName, String lastName);

    //JPQL query
    @Query("select s from Student s where s.email = ?1")
    Student getStudentByEmailAddress(String emailId);

    //JPQL
    @Query("select s.firstName from Student s where s.email = ?1")
    String getStudentFirstNameByEmailAddress(String emailId);

    //Native Sql query
    @Query(value = "select * from tbl_student s where s.email_address=?1",
            nativeQuery = true)
    Student getStudentByEmailAdsressNative(String emailId);

    @Query(
            value = "select * from tbl_student s where s.email_address = :emailId",
            nativeQuery = true
    )
    Student getStudentByEmailAddressNativeNamedParam(@Param("emailId") String email);

    @Modifying
    @Transactional
    @Query(value = "update tbl_student set first_name = ?1 where email_address=?1",
            nativeQuery = true)
    int updateStudentByEmailId(String firstname, String emailid);
}
