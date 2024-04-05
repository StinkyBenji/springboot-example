package com.stbenji.example.service;

import com.stbenji.example.model.StudentInfoDto;
import com.stbenji.example.repository.StudentInfoRepository;
import com.stbenji.example.util.StudentInfoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentInfoService {


    private final StudentInfoRepository studentInfoRepository;
    private final StudentInfoMapper mapper;

//    public Optional<Student> getStudents(Long id) {
//        return studentInfoRepository.findById(id);
//    }

    @Transactional
    public void registerNewStudent(StudentInfoDto dto) {
        studentInfoRepository.save(mapper.fromStudentInfoDto(dto));
    }

    public List<StudentInfoDto> getStudentInfo(Long studentId) {
        return studentInfoRepository.findByStudentId(studentId).stream().map(mapper::toStudentInfoDto).toList();
    }
}
