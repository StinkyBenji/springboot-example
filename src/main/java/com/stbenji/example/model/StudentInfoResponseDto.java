package com.stbenji.example.model;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class StudentInfoResponseDto {
    private Long Id;
    private Long studentId;
    private String name;
    private String email;
    private String age;
    private LocalDate dob;
    private LocalDateTime createdAt;
}
