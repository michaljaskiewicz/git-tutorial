package com.example.gittutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitTutorialApplication {

    public static void main(String[] args) {
        System.out.println("Hello");
        SpringApplication.run(GitTutorialApplication.class, args);
    }

    //unnecessary comment

    String name = "Filip";
}
