package com.n23.quiz_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuizAppApplication {

    public static void main(String[] args) {

        Student s1 = new Student("Nisarg",1);

        SpringApplication.run(QuizAppApplication.class, args);
    }

}
