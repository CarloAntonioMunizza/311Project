package MenuPackage;

import java.io.IOException;
import java.util.Scanner;
import static MenuPackage.Style.*;

public class MainMenu {
	private Scanner scanner;

	public MainMenu() {
		this.scanner = new Scanner(System.in);
	}

	public void displayMenu(int choice) {
		for (int i = 0; i < 3; ++i) System.out.println();
		System.out.println("+---------------------------------------------------+");
		System.out.println("|                                                   |");
		System.out.println("|                -= Galactic Trade =-               |");
		System.out.println("|                                                   |");
		System.out.println("+---------------------------------------------------+");
		System.out.println("|                                                   |");
		System.out.println("|                   Main Menu:                      |");
		System.out.println("|                                                   |");
		System.out.println("|     1. Start New Game                             |");
		System.out.println("|     2. Save Game                                  |");
		System.out.println("|     3. Load Game                                  |");
		System.out.println("|     4. Resume Game                                |");
		System.out.println("|     5. Quit                                       |");
		System.out.println("|                                                   |");
		System.out.println("+---------------------------------------------------+");
		System.out.println("|           Enter your choice (1-5):                |");
		System.out.println("|                                                   |");
		System.out.print("|                      ");
		System.out.println(ANSI_BLUE + choice + ANSI_RESET + "                            |");
		System.out.println("|                                                   |");
		System.out.println("+---------------------------------------------------+");
		for (int i = 0; i < 3; ++i) System.out.println();
		//clearScreen();
	}

	public void displayMenuInput() {
		System.out.println("+---------------------------------------------------+");
		System.out.println("|                                                   |");
		System.out.println("|                -= Galactic Trade =-               |");
		System.out.println("|                                                   |");
		System.out.println("+---------------------------------------------------+");
		System.out.println("|                                                   |");
		System.out.println("|                   Main Menu:                      |");
		System.out.println("|                                                   |");
		System.out.println("|     1. Start New Game                             |");
		System.out.println("|     2. Save Game                                  |");
		System.out.println("|     3. Load Game                                  |");
		System.out.println("|     4. Resume Game                                |");
		System.out.println("|     5. Quit                                       |");
		System.out.println("|                                                   |");
		System.out.println("+---------------------------------------------------+");
		System.out.println("|           Enter your choice (1-5):                |");
		System.out.println("|                                                   |");
		System.out.print("                      ");
		handleUserChoice();
	}

	private void handleUserChoice() {
		int choice = scanner.nextInt();
		scanner.nextLine();
		displayMenu(choice);

		switch (choice) {
			case 1:
				startNewGame();
				break;
			case 2:
				saveGame();
				break;
			case 3:
				loadGame();
				break;
			case 4:
				resumeGame();
				break;
			case 5:
				quitGame();
				break;
			default:
				System.out.println("Invalid option, please try again.");
		}
	}

	public void clearScreen() {
		// Clears Screen in java
		for (int i = 0; i < 6; ++i) System.out.println();
	}

	private void startNewGame() {
		System.out.println("Starting a new game...");
		// Add logic to initialize a new game
	}

	private void saveGame() {
		System.out.println("Saving the game...");
		// Add logic to save the game
	}

	private void loadGame() {
		System.out.println("Loading a game...");
		// Add logic to load a saved game
	}

	private void resumeGame() {
		System.out.println("Resuming the game...");
		// Add logic to resume a paused game
	}

	private void quitGame() {
		System.out.println("Quitting the game, goodbye!");
		// Add any cleanup code here before quitting
	}
}

