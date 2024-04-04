package com.stbenji.example.service;

import com.stbenji.example.entity.Student;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    @GetMapping
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1234L,
                        "James",
                        "h.james@gmail.com",
                        23,
                        LocalDate.of(1998, Month.APRIL, 14)
                )
        );
    }
}
