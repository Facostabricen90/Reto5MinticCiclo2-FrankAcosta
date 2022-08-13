package com.reto5.view;

import com.reto5.controller.ShoppingController;
import com.reto5.model.Shopping;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.util.List;

public class GuiShopping extends JFrame {
    private JPanel panelShopping;
    private DefaultTableModel tabla;
    private List<Shopping> listShopping;
    private ShoppingController controlShopping;
    private JTable tableShopping;

    public GuiShopping(){
        super ("Lista de lideres");
        this.controlShopping = new ShoppingController();
        this.listShopping = this.controlShopping.getShopping();
        this.panelShopping = new JPanel(new BorderLayout());
        this.tabla = new DefaultTableModel(new String[]{
                "ID_Compra", "Constructora", "Banco Vinculado"
        }, listShopping.size());
        this.tableShopping = new JTable(this.tabla);
        TableModel tablita = tableShopping.getModel();

        for (int i = 0; i < listShopping.size(); i++) {
            Shopping shopping = listShopping.get(i);
            tablita.setValueAt(shopping.getIdPurchase(), i, 0);
            tablita.setValueAt(shopping.getConstructor(), i, 1);
            tablita.setValueAt(shopping.getLinkedBank(), i, 2);

        }
        panelShopping.add(tableShopping, BorderLayout.CENTER);
        panelShopping.add(tableShopping.getTableHeader(), BorderLayout.NORTH);
        setContentPane(panelShopping);
    }
}
