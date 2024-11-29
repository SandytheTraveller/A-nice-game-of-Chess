package main;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame("Single Chess Game");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add a Game Panel
        GamePanel panel = new GamePanel();
        window.add(panel);
        window.pack(); //window adjusts its size to the game panel

        window.setResizable(false);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}