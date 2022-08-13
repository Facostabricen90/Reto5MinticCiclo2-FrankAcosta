package com.reto5.dao;

import com.reto5.database.connectDB;
import com.reto5.model.Project;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProjectsDao {
    private List<Project> arrayProject;

    public ProjectsDao(){

    }

    public List<Project> getProject() throws SQLException {
        ResultSet result = null;
        this.arrayProject = new ArrayList<>();
        Connection conn = connectDB.getConnection();
        String query = "SELECT p.ID_Proyecto, p.Constructora, p.Numero_Habitaciones, p.Ciudad, p.Clasificacion \n" +
                "FROM Proyecto p \n" +
                "WHERE (p.Ciudad = 'Santa Marta' OR p.Ciudad = 'Cartagena' OR p.Ciudad = 'Barranquilla')\n" +
                "AND p.Clasificacion = 'Casa Campestre'";
        Statement std = conn.createStatement();
        result = std.executeQuery(query);
        while (result.next()) {
            Project project = new Project();
            project.setIdProject(result.getInt("ID_Proyecto"));
            project.setConstructor(result.getString("Constructora"));
            project.setNumberRooms(result.getInt("Numero_Habitaciones"));
            project.setCity(result.getString("Ciudad"));
            project.setClasification(result.getString("Clasificacion"));
            arrayProject.add(
                    project
            );
        }
        conn.close();
        return arrayProject;
    }
}
