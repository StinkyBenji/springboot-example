package com.stbenji.example.controller;

import com.stbenji.example.model.StudentInfoDto;
import com.stbenji.example.service.StudentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "v1/student", produces = MediaType.APPLICATION_JSON_VALUE)
public class StudentController {

    private final StudentService studentService;
//    @Autowired
//    public StudentController(StudentService studentService) {
//        this.studentService = studentService;
//    }
//

//    @GetMapping(path = "/v1/student/{id}")
//    public Optional<Student> getStudents(@PathVariable("id") Long id) {
//        return studentService.getStudents(id);
//    }


    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> registerNewStudent(@Valid @RequestBody StudentInfoDto studentInfoDto) {
        studentService.registerNewStudent(studentInfoDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
