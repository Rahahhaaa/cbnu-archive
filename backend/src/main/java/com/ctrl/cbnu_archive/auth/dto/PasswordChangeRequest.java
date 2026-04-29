package com.ctrl.cbnu_archive.auth.dto;

public record PasswordChangeRequest(
        String currentPassword,
        String newPassword
) {
}
