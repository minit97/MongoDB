package com.example.nosqlstudy.mongodb_study.repository;

import com.example.nosqlstudy.mongodb_study.entity.Subject;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends MongoRepository<Subject, String> {
}
