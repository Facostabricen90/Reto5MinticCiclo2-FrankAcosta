package com.reto5.controller;

import com.reto5.dao.ProjectsDao;
import com.reto5.model.Project;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProjectController {
    public List<Project> getProject(){
        ProjectsDao projectsdao = new ProjectsDao();
        try {
            return projectsdao.getProject();
        } catch (SQLException e) {
            return new ArrayList<>();
        }
    }
}
