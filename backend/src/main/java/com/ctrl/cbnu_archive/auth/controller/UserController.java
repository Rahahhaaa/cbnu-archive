package com.ctrl.cbnu_archive.auth.controller;

import com.ctrl.cbnu_archive.auth.dto.PasswordChangeRequest;
import com.ctrl.cbnu_archive.auth.dto.UserResponse;
import com.ctrl.cbnu_archive.auth.dto.UserUpdateRequest;
import com.ctrl.cbnu_archive.auth.service.UserService;
import com.ctrl.cbnu_archive.global.response.ApiResponse;
import com.ctrl.cbnu_archive.global.security.jwt.CustomUserDetails;
import com.ctrl.cbnu_archive.project.dto.ProjectResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/me")
    public ResponseEntity<ApiResponse<UserResponse>> getMyInfo(
            @AuthenticationPrincipal CustomUserDetails userDetails) {
        UserResponse response = userService.getMyInfo(userDetails.getId());
        return ResponseEntity.ok(ApiResponse.success(response));
    }

    @PatchMapping("/me")
    public ResponseEntity<ApiResponse<UserResponse>> updateMyInfo(
            @AuthenticationPrincipal CustomUserDetails userDetails,
            @Valid @RequestBody UserUpdateRequest request) {
        UserResponse response = userService.updateMyInfo(userDetails.getId(), request);
        return ResponseEntity.ok(ApiResponse.success(response));
    }

    @PatchMapping("/me/password")
    public ResponseEntity<ApiResponse<Void>> changePassword(
            @AuthenticationPrincipal CustomUserDetails userDetails,
            @Valid @RequestBody PasswordChangeRequest request) {
        userService.changePassword(userDetails.getId(), request);
        return ResponseEntity.ok(ApiResponse.success(null));
    }

    @GetMapping("/me/projects")
    public ResponseEntity<ApiResponse<Page<ProjectResponse>>> getMyProjects(
            @AuthenticationPrincipal CustomUserDetails userDetails,
            Pageable pageable) {
        Page<ProjectResponse> projects = userService.getMyProjects(userDetails.getId(), pageable);
        return ResponseEntity.ok(ApiResponse.success(projects));
    }
}
