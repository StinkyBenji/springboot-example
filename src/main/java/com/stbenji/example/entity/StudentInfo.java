package com.stbenji.example.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Student Info")
public class StudentInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", updatable = false, nullable = false)
    private Long id;

    @Column(name = "StudentID")
    private Long studentId;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Transient
    @Column(name = "age")
    private Integer age;

    @Column(name = "birthday")
    private LocalDate dob;

    @CreationTimestamp
    @Column(name = "CreatedAt")
    private LocalDateTime createdAt;

    public Integer getAge(LocalDate dob) {
        return Period.between(dob, LocalDate.now()).getYears();
    }

    public Integer setAge(LocalDate dob) {
        return Period.between(dob, LocalDate.now()).getYears();
    }

}
