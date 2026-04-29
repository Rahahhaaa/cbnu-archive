package com.ctrl.cbnu_archive.auth.dto;

public record UserUpdateRequest(
        String name,
        String studentNumber
) {
}
