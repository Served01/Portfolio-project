package com.portfolio.backend.service;

import com.portfolio.backend.dto.UserDto;
import com.portfolio.backend.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    
    private final UserMapper userMapper;
    
    public List<UserDto> getAllUsers() {
        return userMapper.findAll();
    }
    
    public Optional<UserDto> getUserById(Long id) {
        UserDto user = userMapper.findById(id);
        return Optional.ofNullable(user);
    }
    
    public Optional<UserDto> getUserByEmail(String email) {
        UserDto user = userMapper.findByEmail(email);
        return Optional.ofNullable(user);
    }
    
    public UserDto createUser(UserDto user) {
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());
        userMapper.insert(user);
        return user;
    }
    
    public UserDto updateUser(Long id, UserDto userDetails) {
        UserDto existingUser = userMapper.findById(id);
        if (existingUser == null) {
            throw new RuntimeException("User not found with id: " + id);
        }
        
        existingUser.setName(userDetails.getName());
        existingUser.setBio(userDetails.getBio());
        existingUser.setProfileImage(userDetails.getProfileImage());
        existingUser.setUpdatedAt(LocalDateTime.now());
        
        userMapper.update(existingUser);
        return existingUser;
    }
    
    public void deleteUser(Long id) {
        userMapper.deleteById(id);
    }
    
    public boolean existsByEmail(String email) {
        return userMapper.existsByEmail(email);
    }
}
