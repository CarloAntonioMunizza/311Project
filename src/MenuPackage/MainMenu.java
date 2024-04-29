package MenuPackage;

import PlanetFolder.HomePlanet;
import GameState.GameState;
import java.io.IOException;
import java.util.Scanner;
import static MenuPackage.Style.*;

public class MainMenu {
	private static Scanner scanner;

	public MainMenu() {
		scanner = new Scanner(System.in);
	}

	public static void displayMenu(int choice) {
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

	public  void displayMenuInput() {
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

	public static void clearScreen() {
		// Clears Screen in java
		for (int i = 0; i < 6; ++i) System.out.println();
	}

	private static void startNewGame() {
		System.out.println("Starting a new game...");
		GameState.InitializeNewGame();
	}

	private static void saveGame() {
		System.out.println("Saving the game...");
		// Add logic to save the game
	}

	private static void loadGame() {
		System.out.println("Loading a game...");
		// Add logic to load a saved game
	}

	private static void resumeGame() {
		System.out.println("Resuming the game...");
		// Add logic to resume a paused game
	}

	private static void quitGame() {
		System.out.println("Quitting the game, goodbye!");
		// Add any cleanup code here before quitting
	}
}

