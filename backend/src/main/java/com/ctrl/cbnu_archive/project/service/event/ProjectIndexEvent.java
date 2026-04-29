package com.ctrl.cbnu_archive.project.service.event;

import com.ctrl.cbnu_archive.project.service.port.ProjectIndexDocument;

public record ProjectIndexEvent(
        Long projectId,
        ProjectIndexDocument indexDocument,
        String embeddingText
) {
}
