package com.example.javagame2d;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javax.swing.JFrame;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.SwingUtilities;

public class HelloApplication  {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("Mischief Managed");
        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        gamePanel.setupGame();
        gamePanel.startGameThread();
    }
}