package com.portfolio.backend.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    
    private Long id;
    private String email;
    private String name;
    private String bio;
    private String profileImage;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
