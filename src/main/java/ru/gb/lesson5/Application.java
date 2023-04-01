package ru.gb.lesson5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        StudentDAO studentDAO = new StudentDAO();
        for (int i = 0; i < 1000; i++) {
            Student student = new Student();
            student.setName("Student " + i);
            student.setMark((int) (Math.random() * 100));
            studentDAO.add(student);
        }
    }
}
