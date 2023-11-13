package com.example.nosqlstudy.mongodb_study.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "department")
@Getter
@Setter
public class Department {
    @Id
    private String id;

    @Field(name = "department_name")
    private String departmentName;
    private String location;

}
