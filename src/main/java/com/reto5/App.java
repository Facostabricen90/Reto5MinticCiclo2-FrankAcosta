package com.reto5;

import com.reto5.view.GuiInterface;

import javax.swing.*;

public class App
{
    public static void main( String[] args ){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new GuiInterface();
                frame.setSize(500,400);
                frame.setVisible(true);
            }
        }
        );
    }
}
