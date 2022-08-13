package com.reto5.controller;

import com.reto5.dao.LeaderDao;
import com.reto5.model.Leader;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LeaderController {

    public List<Leader> getLeader(){
        LeaderDao leaderdao = new LeaderDao();
        try {
            return leaderdao.getLeader();
        } catch (SQLException e) {
            return new ArrayList<>();
        }
    }
}
