package com.ctrl.cbnu_archive.auth.dto;

import com.ctrl.cbnu_archive.auth.domain.User;
import com.ctrl.cbnu_archive.auth.domain.UserRole;

public record UserResponse(
        Long id,
        String email,
        String name,
        String studentNumber,
        UserRole role
) {
    public static UserResponse fromEntity(User user) {
        return new UserResponse(
                user.getId(),
                user.getEmail(),
                user.getName(),
                user.getStudentNumber(),
                user.getRole()
        );
    }
}
