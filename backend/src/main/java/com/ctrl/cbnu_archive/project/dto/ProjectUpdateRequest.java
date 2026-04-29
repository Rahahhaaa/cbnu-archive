package com.ctrl.cbnu_archive.project.dto;

import com.ctrl.cbnu_archive.project.domain.Project;
import java.util.List;

public record ProjectUpdateRequest(
        String title,
        String description,
        String readme,
        List<String> techStacks,
        Integer year,
        String semester,
        String difficulty,
        String domain
) {
    public void applyTo(Project project) {
        project.updateDetails(
                title == null ? project.getTitle() : title,
                description == null ? project.getDescription() : description,
                readme == null ? project.getReadme() : readme,
                techStacks == null ? project.getTechStacks() : techStacks,
                year == null ? project.getYear() : year,
                semester == null ? project.getSemester() : semester,
                difficulty == null ? project.getDifficulty() : difficulty,
                domain == null ? project.getDomain() : domain
        );
    }
}
