package com.Services;

import com.DAOs.ProjectDao;
import com.Entities.Project;

public class ProjectService {
    private ProjectDao projectDao = new ProjectDao();

    public void createProject(Project project) {
        projectDao.saveProject(project);
    }

    public Project findProjectById(Long id) {
        return projectDao.getProject(id);
    }
}
