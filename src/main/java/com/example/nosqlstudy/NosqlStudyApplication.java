package com.example.nosqlstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
//@EnableMongoRepositories("com.example.nosqlstudy.mongodb_study.repository")	// mongo repository 활성화
public class NosqlStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(NosqlStudyApplication.class, args);
	}

}
