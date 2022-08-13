package com.reto5.dao;

import com.reto5.database.connectDB;
import com.reto5.model.Leader;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class LeaderDao {
    private List<Leader> arrayLeader;

    public LeaderDao(){

    }

    public List<Leader> getLeader() throws SQLException {
        ResultSet result = null;
        this.arrayLeader = new ArrayList<>();
        Connection conn = connectDB.getConnection();
        String query = "SELECT l.ID_Lider, l.Nombre, l.Primer_Apellido , l.Ciudad_Residencia \n" +
                "FROM Lider l \n" +
                "ORDER BY l.Ciudad_Residencia ASC";
        Statement std = conn.createStatement();
        result = std.executeQuery(query);
        while (result.next()) {
            Leader leader = new Leader();
            leader.setIdLeader(result.getInt("ID_Lider"));
            leader.setName(result.getString("Nombre"));
            leader.setSurname(result.getString("Primer_Apellido"));
            leader.setCityResidence(result.getString("Ciudad_Residencia"));
            arrayLeader.add(
                    leader
            );
        }
        conn.close();
        return arrayLeader;
    }
}
