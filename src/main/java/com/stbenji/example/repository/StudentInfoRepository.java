package com.stbenji.example.repository;

import com.stbenji.example.entity.StudentInfo;
import com.stbenji.example.model.StudentInfoDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface StudentInfoRepository extends JpaRepository<StudentInfo, Long> {

    List<StudentInfo> findByStudentId(Long studentId);
}
