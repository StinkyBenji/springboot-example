package com.stbenji.example.util;

import com.stbenji.example.entity.StudentInfo;
import com.stbenji.example.model.StudentInfoDto;
import com.stbenji.example.model.StudentInfoResponseDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.ERROR, componentModel = "spring")
public interface StudentInfoMapper {
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "age", ignore = true)
    StudentInfo fromStudentInfoDto(StudentInfoDto dto);
    StudentInfoDto toStudentInfoDto(StudentInfo entity);
    StudentInfoResponseDto toStudentInfoResponseDto(StudentInfo entity);

}
