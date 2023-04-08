package com.km;

import javax.swing.*;

public class Application {

    public static void main(String... args) {
        MainFrame frame = new MainFrame();
        SwingUtilities.invokeLater(frame::setUp);
    }
}
