package com.reto5.view;

import com.reto5.controller.LeaderController;
import com.reto5.model.Leader;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.util.List;

public class GuiLeader extends JFrame {
    private JPanel panelLeader;
    private DefaultTableModel tabla;
    private List<Leader> listLeader;
    private LeaderController controLeader;
    private JTable tableLeader;

    public GuiLeader(){
        super ("Lista de lideres");
        this.controLeader = new LeaderController();
        this.listLeader = this.controLeader.getLeader();
        this.panelLeader = new JPanel(new BorderLayout());
        this.tabla = new DefaultTableModel(new String[]{
                "ID_Lider", "Nombre", "Primer apellido", "Ciudad de residencia"
        }, listLeader.size());
        this.tableLeader = new JTable(this.tabla);
        TableModel tablita = tableLeader.getModel();

        for (int i = 0; i < listLeader.size(); i++) {
            Leader leader = listLeader.get(i);
            tablita.setValueAt(leader.getIdLeader(), i, 0);
            tablita.setValueAt(leader.getName(), i, 1);
            tablita.setValueAt(leader.getSurname(), i, 2);
            tablita.setValueAt(leader.getCityResidence(), i, 3);
        }
        panelLeader.add(tableLeader, BorderLayout.CENTER);
        panelLeader.add(tableLeader.getTableHeader(), BorderLayout.NORTH);
        setContentPane(panelLeader);


    }
}
