package com.stbenji.example.repository;

import com.stbenji.example.entity.StudentInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentInfoRepository extends JpaRepository<StudentInfo, Long> {

}
