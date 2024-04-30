package GUIPages;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUICreateGame extends JFrame {
	private JLabel GameNameLabel;
	private JTextField GameNameTextField;
	private JButton SubmitButton;
	private JLabel CreateGamePageLabel;
	private JButton BackButton;
	private JPanel GUICreateGame;
	private JLabel errorMessageLabel;

	public GUICreateGame() {
		// Initialize the JPanel with a BorderLayout
		GUICreateGame = new JPanel(new BorderLayout());
		GUICreateGame.setBackground(Color.DARK_GRAY);  // Set the panel background color

		// Initialize components
		GameNameLabel = new JLabel("Game Name:");
		GameNameLabel.setForeground(Color.WHITE);  // Set the text color
		GameNameTextField = new JTextField(20);
		SubmitButton = createStyledButton("Submit");
		CreateGamePageLabel = new JLabel("Create Game", SwingConstants.CENTER);
		CreateGamePageLabel.setForeground(Color.WHITE);  // Set the text color
		CreateGamePageLabel.setFont(new Font("Serif", Font.BOLD, 24));  // Set the font style
		BackButton = createStyledButton("Back");

		// Error message label setup
		errorMessageLabel = new JLabel("You need to enter a game name.");
		errorMessageLabel.setForeground(Color.RED);
		errorMessageLabel.setFont(new Font("Serif", Font.BOLD, 16));
		errorMessageLabel.setVisible(false);  // Initially hidden

		// Add components to the JPanel
		GUICreateGame.add(CreateGamePageLabel, BorderLayout.NORTH);

		JPanel formPanel = new JPanel(new FlowLayout());  // Use FlowLayout for alignment
		formPanel.setBackground(Color.DARK_GRAY);  // Set background color
		formPanel.add(errorMessageLabel);
		formPanel.add(GameNameLabel);
		formPanel.add(GameNameTextField);

		GUICreateGame.add(formPanel, BorderLayout.CENTER);

		JPanel buttonPanel = new JPanel(new FlowLayout());
		buttonPanel.setBackground(Color.DARK_GRAY);  // Set background color
		buttonPanel.add(SubmitButton);
		buttonPanel.add(BackButton);

		GUICreateGame.add(buttonPanel, BorderLayout.SOUTH);

		// Set the content pane to the initialized JPanel
		setContentPane(GUICreateGame);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();  // Adjusts size to components
		setLocationRelativeTo(null);  // Center the window on screen
		setVisible(true);

		// Add action listeners
		addActionListeners();
	}

	private JButton createStyledButton(String text) {
		JButton button = new JButton(text);
		button.setForeground(Color.WHITE);  // Text color for dark mode
		button.setBackground(Color.BLACK);  // Background color for buttons in dark mode
		button.setFocusPainted(false);  // Remove focus border
		button.setFont(new Font("Serif", Font.BOLD, 16));  // Font styling
		return button;
	}

	private void addActionListeners() {
		SubmitButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String gameName = GameNameTextField.getText();
				if (gameName.isEmpty()) {
					errorMessageLabel.setVisible(true);  // Show error message if the text field is empty
				} else {
					errorMessageLabel.setVisible(false);  // Hide error message if entering the game creation phase
					JOptionPane.showMessageDialog(GUICreateGame.this, "Game '" + gameName + "' created.", "Success", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});

		BackButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				GUIMainMenu mainMenu = new GUIMainMenu();
				mainMenu.setVisible(true);
				dispose();  // Close the current window
			}
		});
	}
}