package com.example.nosqlstudy.mongodb_study.repository;


import com.example.nosqlstudy.mongodb_study.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {
    List<Student> findByName(String name);
    List<Student> findByNameAndEmail(String name, String email);
    List<Student> findByNameOrEmail(String name, String email);
    List<Student> findByDepartmentDepartmentName(String deptname);  // @DBRef 사용 시 X
    List<Student> findBySubjectsSubjectName(String subName);    // @DBRef 사용 시 X
    List<Student> findByEmailIsLike(String email);
    List<Student> findByNameStartsWith(String name);
    List<Student> findByDepartmentId(String deptId);    // @DBRef 사용 시 O
    @Query("{ \"name\" : \":name\" }")
    List<Student> getByName(@Param("name") String name);
}
