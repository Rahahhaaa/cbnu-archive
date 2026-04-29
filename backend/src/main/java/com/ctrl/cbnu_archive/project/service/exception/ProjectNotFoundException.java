package com.ctrl.cbnu_archive.project.service.exception;

public class ProjectNotFoundException extends RuntimeException {
    public ProjectNotFoundException(Long projectId) {
        super("Project not found: " + projectId);
    }
}
