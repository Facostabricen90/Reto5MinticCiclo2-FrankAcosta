package com.reto5.database;
import java.sql.*;

public class connectDB {
    // Atributos de clase para gestión de conexión con la base de datos
    private static final String PATH_BD = "ProyectosConstruccion.db";

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:sqlite:" + PATH_BD;
        return DriverManager.getConnection(url);
    }
}
