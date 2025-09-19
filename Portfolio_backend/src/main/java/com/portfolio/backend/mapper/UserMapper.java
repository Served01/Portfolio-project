package com.portfolio.backend.mapper;

import com.portfolio.backend.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface UserMapper {
    
    // 모든 사용자 조회
    List<UserDto> findAll();
    
    // ID로 사용자 조회
    UserDto findById(@Param("id") Long id);
    
    // 이메일로 사용자 조회
    UserDto findByEmail(@Param("email") String email);
    
    // 사용자 생성
    int insert(UserDto user);
    
    // 사용자 수정
    int update(UserDto user);
    
    // 사용자 삭제
    int deleteById(@Param("id") Long id);
    
    // 이메일 존재 여부 확인
    boolean existsByEmail(@Param("email") String email);
    
    // 사용자 수 조회
    int count();
}
