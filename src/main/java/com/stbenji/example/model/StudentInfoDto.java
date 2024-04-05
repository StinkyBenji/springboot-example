package com.stbenji.example.model;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class StudentInfoDto {

    @NotNull(message = "Student ID cannot be blank.")
    private Long studentId;

    @NotBlank(message = "Student name cannot be blank.")
    private String name;

    @NotBlank(message = "Student Email cannot be blank.")
    private String email;

    @NotNull(message = "Student Birthday cannot be blank.")
    private LocalDate dob;
}
