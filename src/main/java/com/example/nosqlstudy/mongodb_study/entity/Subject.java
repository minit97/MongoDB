package com.example.nosqlstudy.mongodb_study.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "subject")
@Getter
@Setter
public class Subject {
    @Id
    private String id;

    @Field(name = "subject_name")
    private String subjectName;
    @Field(name = "marks_obtained")
    private int marksObtained;

}
