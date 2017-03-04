package com.affordall.gui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 * Created by Affy on 3/5/2017.
 */
public class Map extends JTable {

    private static final int MAP_SIZE = 100;
    private static final int CELL_SIZE = 5;

    public Map() {
        this.setModel(new DefaultTableModel(MAP_SIZE, MAP_SIZE));
        this.setRowHeight(CELL_SIZE);
        for (int i = 0; i < MAP_SIZE; i++) {
            this.getColumnModel().getColumn(i).setMinWidth(CELL_SIZE);
            this.getColumnModel().getColumn(i).setMaxWidth(CELL_SIZE);
        }
    }

}
