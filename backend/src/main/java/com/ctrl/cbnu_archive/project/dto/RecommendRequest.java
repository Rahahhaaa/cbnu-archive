package com.ctrl.cbnu_archive.project.dto;

import jakarta.validation.constraints.NotBlank;

public record RecommendRequest(
        @NotBlank(message = "질문은 필수입니다")
        String query
) {
}
