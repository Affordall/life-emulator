package com.affordall.runner;

import com.affordall.gui.MainWindow;

/**
 * Created by Affy on 3/4/2017.
 */
public class Runner {

    public static void main(String[] args) {
        try {
            MainWindow mainWindow = new MainWindow();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
