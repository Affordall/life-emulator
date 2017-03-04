package com.affordall.gui;

import javax.swing.*;

/**
 * Created by Affy on 3/4/2017.
 */
public class MainWindow extends JFrame {

    public MainWindow() throws Exception {
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        setBounds(20, 20, 550, 550);

        this.add(new Map());


        setVisible(true);
    }

}
