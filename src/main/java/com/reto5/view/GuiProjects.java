package com.reto5.view;

import com.reto5.controller.ProjectController;
import com.reto5.model.Project;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.util.List;

public class GuiProjects extends JFrame {
    private JPanel panelProjects;
    private DefaultTableModel tabla;
    private List<Project> listProjects;
    private ProjectController controlProjects;
    private JTable tableProjects;

    public GuiProjects(){
        super ("Lista de lideres");
        this.controlProjects = new ProjectController();
        this.listProjects = this.controlProjects.getProject();
        this.panelProjects = new JPanel(new BorderLayout());
        this.tabla = new DefaultTableModel(new String[]{
                "ID_Projects", "Constructora", "Numero de Cuartos", "Ciudad", "Clasificacion"
        }, listProjects.size());
        this.tableProjects = new JTable(this.tabla);
        TableModel tablita = tableProjects.getModel();

        for (int i = 0; i < listProjects.size(); i++) {
            Project project = listProjects.get(i);
            tablita.setValueAt(project.getIdProject(), i, 0);
            tablita.setValueAt(project.getConstructor(), i, 1);
            tablita.setValueAt(project.getNumberRooms(), i, 2);
            tablita.setValueAt(project.getCity(), i, 3);
            tablita.setValueAt(project.getClasification(), i, 4);

        }
        panelProjects.add(tableProjects, BorderLayout.CENTER);
        panelProjects.add(tableProjects.getTableHeader(), BorderLayout.NORTH);
        setContentPane(panelProjects);
    }
}
