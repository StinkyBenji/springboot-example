package com.stbenji.example.repository;

import com.stbenji.example.entity.StudentInfo;
import com.stbenji.example.model.StudentInfoDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface StudentInfoRepository extends JpaRepository<StudentInfo, Long> {

    Optional<StudentInfo> findByStudentId(Long studentId);
}
