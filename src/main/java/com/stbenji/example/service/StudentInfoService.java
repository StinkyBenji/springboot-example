package com.stbenji.example.service;

import com.stbenji.example.entity.StudentInfo;
import com.stbenji.example.model.StudentInfoDto;
import com.stbenji.example.model.StudentInfoResponseDto;
import com.stbenji.example.repository.StudentInfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentInfoService {


    private final StudentInfoRepository studentInfoRepository;

    @Transactional
    public void registerNewStudent(StudentInfo studentInfo) {
        studentInfoRepository.save(studentInfo);
    }

    public Optional<StudentInfo> getStudentInfo(Long studentId) {
        return studentInfoRepository.findByStudentId(studentId);
    }
}
