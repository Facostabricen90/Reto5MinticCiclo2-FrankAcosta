package com.reto5.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiInterface extends JFrame {
    private JPanel panel1;
    private JLabel opcion;
    private JLabel primerInforme;
    private JLabel segundoInforme;
    private JLabel tercerInforme;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton salirButton;

    public GuiInterface() {
        super("Reto 5");
        setContentPane(panel1);

        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        JFrame frame = new GuiLeader();
                        frame.setSize(1000,1000);
                        frame.setVisible(true);
                    }
                });
            };

        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        JFrame frame = new GuiProjects();
                        frame.setSize(600,400);
                        frame.setVisible(true);
                    }
                });
            };

        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        JFrame frame = new GuiShopping();
                        frame.setSize(500,400);
                        frame.setVisible(true);
                    }
                });
            };

        });
    }
}
