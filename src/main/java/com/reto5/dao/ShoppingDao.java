package com.reto5.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.reto5.database.connectDB;
import com.reto5.model.Shopping;

public class ShoppingDao {
    private List<Shopping> arrayShopping;

    public ShoppingDao(){

    }

    public List<Shopping> getShopping() throws SQLException{
        ResultSet result = null;
        this.arrayShopping = new ArrayList<>();
        Connection conn = connectDB.getConnection();
        String query = "SELECT c.ID_Compra, p.Constructora, p.Banco_Vinculado\n" +
                "FROM Compra c \n" +
                "JOIN Proyecto p on c.ID_Proyecto = p.ID_Proyecto\n" +
                "WHERE c.Proveedor = 'Homecenter' AND p.Ciudad = \"Salento\"";
        Statement std = conn.createStatement();
        result = std.executeQuery(query);
        while (result.next()) {
            Shopping shopping = new Shopping();
            shopping.setIdPurchase(result.getInt("ID_Compra"));
            shopping.setConstructor(result.getString("Constructora"));
            shopping.setLinkedBank(result.getString("Banco_Vinculado"));
            arrayShopping.add(
                    shopping
            );
        }
        conn.close();
        return arrayShopping;
    }
}
