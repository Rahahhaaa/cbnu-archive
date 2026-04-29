package com.ctrl.cbnu_archive.project.mapper;

import com.ctrl.cbnu_archive.auth.domain.User;
import com.ctrl.cbnu_archive.project.domain.Project;
import com.ctrl.cbnu_archive.project.dto.ProjectCreateRequest;
import com.ctrl.cbnu_archive.project.dto.ProjectResponse;
import com.ctrl.cbnu_archive.project.dto.ProjectUpdateRequest;
import com.ctrl.cbnu_archive.project.service.port.ProjectSearchResult;

public class ProjectMapper {

    private ProjectMapper() {
        throw new UnsupportedOperationException("ProjectMapper is a utility class");
    }

    public static Project toEntity(ProjectCreateRequest request, User author) {
        return request.toEntity(author);
    }

    public static ProjectResponse toResponse(Project project) {
        return ProjectResponse.fromEntity(project);
    }

    public static ProjectResponse toResponse(ProjectSearchResult searchResult) {
        return ProjectResponse.fromSearchResult(searchResult);
    }

    public static void applyUpdate(ProjectUpdateRequest request, Project project) {
        request.applyTo(project);
    }
}
