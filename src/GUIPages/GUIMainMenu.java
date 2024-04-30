package GUIPages;

import javax.swing.*;
import java.awt.*;

public class GUIMainMenu extends JFrame {
    private JButton LoadButton;
    private JButton ExitButton;
    private JButton StartButton;
    private JButton SaveButton;
    private JTextField TitleField;
    private JPanel gui;

    public GUIMainMenu() {
        gui = new JPanel(new BorderLayout());  // Initialize the JPanel with BorderLayout
        gui.setBackground(Color.DARK_GRAY);  // Set the background color for dark mode

        TitleField = new JTextField("Galactic Trade Game", 20);

        // Initialize buttons and style them for dark mode
        StartButton = createStyledButton("Start Game");
        SaveButton = createStyledButton("Save Game");
        LoadButton = createStyledButton("Load Game");
        ExitButton = createStyledButton("Exit");

        StartButton.addActionListener(e -> {
            // Open the game setup page
            // new GUIGameSetup();
            GUICreateGame createGame = new GUICreateGame();
            createGame.setVisible(true);

            dispose();  // Close the current window
        });

        // Create a panel for buttons with GridLayout for vertical alignment
        JPanel buttonPanel = new JPanel(new GridLayout(4, 1, 10, 10));
        buttonPanel.setBackground(Color.DARK_GRAY);  // Set the panel background for dark mode
        buttonPanel.add(StartButton);
        buttonPanel.add(SaveButton);
        buttonPanel.add(LoadButton);
        buttonPanel.add(ExitButton);

        // Create a title label and style it
        JLabel titleLabel = new JLabel("Galactic Trade Game", SwingConstants.CENTER);
        titleLabel.setForeground(Color.WHITE);  // Text color for dark mode
        titleLabel.setFont(new Font("Serif", Font.BOLD, 24));
        titleLabel.setBackground(Color.DARK_GRAY);

        // Add components to 'gui' panel
        gui.add(titleLabel, BorderLayout.NORTH);
        gui.add(buttonPanel, BorderLayout.CENTER);

        // Set JFrame properties
        setContentPane(gui);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private JButton createStyledButton(String text) {
        JButton button = new JButton(text);
        button.setForeground(Color.WHITE);  // Text color for dark mode
        button.setBackground(Color.BLACK);  // Background color for buttons in dark mode
        button.setFocusPainted(false);
        button.setFont(new Font("Serif", Font.BOLD, 18));
        return button;
    }
}