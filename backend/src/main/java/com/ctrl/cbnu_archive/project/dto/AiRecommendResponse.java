package com.ctrl.cbnu_archive.project.dto;

import java.util.List;

public record AiRecommendResponse(
        String answer,
        List<Long> recommendedProjectIds,
        String reasoning
) {
}
