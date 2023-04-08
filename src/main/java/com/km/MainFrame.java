package com.km;

import javax.swing.*;

public class MainFrame extends JFrame {
    private static final int HEIGHT = 600;
    private static final int WIDTH = 800;

    public MainFrame() {

    }

    void setUp() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setVisible(true);
    }
}

