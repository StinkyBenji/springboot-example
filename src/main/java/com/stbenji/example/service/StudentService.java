package com.stbenji.example.service;

import com.stbenji.example.model.StudentInfoDto;
import com.stbenji.example.repository.StudentInfoRepository;
import com.stbenji.example.util.StudentInfoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class StudentService {


    private final StudentInfoRepository studentInfoRepository;
    private final StudentInfoMapper mapper;

//    public Optional<Student> getStudents(Long id) {
//        return studentInfoRepository.findById(id);
//    }

    @Transactional
    public void registerNewStudent(StudentInfoDto payload) {
        studentInfoRepository.save(mapper.fromStudentInfoDto(payload));
    }
}
