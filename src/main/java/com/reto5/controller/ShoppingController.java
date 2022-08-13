package com.reto5.controller;

import com.reto5.dao.ShoppingDao;
import com.reto5.model.Shopping;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ShoppingController {
    public List<Shopping> getShopping(){
        ShoppingDao shoppingdao = new ShoppingDao();
        try {
            return shoppingdao.getShopping();
        } catch (SQLException e) {
            return new ArrayList<>();
        }
    }

}
