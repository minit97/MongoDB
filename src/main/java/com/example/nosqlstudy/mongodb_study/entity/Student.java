package com.example.nosqlstudy.mongodb_study.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document(collection = "student")
@Getter
@Setter
public class Student {
    @Id
    private String id;

    private String name;

    @Field(name = "mail")
    private String email;

    private Department department;

    @DBRef(lazy = true)
    private List<Subject> subjects;

    @Transient  // 해당 필드 무시
    private double percentage;

    public double getPercentage() {
        if (subjects != null && subjects.size() > 0) {
            int total = 0;
            for (Subject subject : subjects) {
                total += subject.getMarksObtained();
            }
            return (double) total /subjects.size();
        }
        return 0.0;
    }
}
