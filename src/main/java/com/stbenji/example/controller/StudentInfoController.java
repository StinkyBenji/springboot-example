package com.stbenji.example.controller;

import com.stbenji.example.model.StudentInfoDto;
import com.stbenji.example.service.StudentInfoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "v1/student", produces = MediaType.APPLICATION_JSON_VALUE)
public class StudentInfoController {

    private final StudentInfoService service;
//    with the @RequiredArgsConstructor annotation, the following lines can be deleted
//    @Autowired
//    public StudentController(StudentService studentService) {
//        this.studentService = studentService;
//    }
//

    @Operation(summary = "Add the information of newly registered student")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Succeeded"),
            @ApiResponse(responseCode = "400", description = "Failed")
    })
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> registerNewStudent(@Valid @RequestBody StudentInfoDto dto) {
        service.registerNewStudent(dto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @Operation(summary = "Get the information of registered students")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Succeeded"),
            @ApiResponse(responseCode = "400", description = "Failed")
    })
    @GetMapping(path = "/{studentId}")
    public ResponseEntity<List<StudentInfoDto>> getStudentInfo(@PathVariable("studentId") Long studentId) {
        return ResponseEntity.ok(service.getStudentInfo(studentId));
    }
}
