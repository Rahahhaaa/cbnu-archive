package com.ctrl.cbnu_archive.project.repository;

import com.ctrl.cbnu_archive.project.domain.Project;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
    Page<Project> findByAuthorId(Long authorId, Pageable pageable);
}
