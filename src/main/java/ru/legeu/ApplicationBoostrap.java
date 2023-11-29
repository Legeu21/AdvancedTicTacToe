package ru.legeu;

import javax.swing.*;

public class ApplicationBoostrap {

    public static void main(String[] args) {

        var frame = new JFrame("Game");
        frame.setSize(552, 552);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        JButton button = new JButton("Start Game");
        button.setSize(156, 72);
        button.setVisible(true);
        button.setLocation((frame.getWidth() / 2 - button.getWidth() / 2), (frame.getHeight() / 2 - button.getHeight() / 2));
        frame.add(button);
    }
}