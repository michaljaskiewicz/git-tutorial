package com.example.gittutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitTutorialApplication {

    public static void main(String[] args) {
        System.out.println("Test change");
        SpringApplication.run(GitTutorialApplication.class, args);
        System.out.println("zmiana dominika");
    }
}
