package MenuPackage;

public class Style {
	// ANSI escape codes for setting text color
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";

	// ANSI escape codes for setting background color
	public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
	public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
	public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
	public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
	public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
	public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
	public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
	public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

	// ANSI escape codes for setting text style
	public static final String ANSI_BOLD = "\u001B[1m";
	public static final String ANSI_ITALIC = "\u001B[3m";
	public static final String ANSI_UNDERLINE = "\u001B[4m";
	public static final String ANSI_REVERSE = "\u001B[7m";
	public static final String ANSI_INVISIBLE = "\u001B[8m";

	// Example usage
	public static void main(String[] args) {
		System.out.println(ANSI_RED + "This text will be red!" + ANSI_RESET);
		System.out.println(ANSI_GREEN + "This text will be green!" + ANSI_RESET);
		System.out.println(ANSI_BLUE + "This text will be blue!" + ANSI_RESET);
		System.out.println(ANSI_YELLOW + "This text will be yellow!" + ANSI_RESET);
		System.out.println(ANSI_PURPLE + "This text will be purple!" + ANSI_RESET);
		System.out.println(ANSI_CYAN + "This text will be cyan!" + ANSI_RESET);
		System.out.println(ANSI_WHITE + "This text will be white!" + ANSI_RESET);
		System.out.println(ANSI_BLACK + "This text will be black!" + ANSI_RESET);
		System.out.println(ANSI_BLACK_BACKGROUND + "This text will have a black background!" + ANSI_RESET);
		System.out.println(ANSI_RED_BACKGROUND + "This text will have a red background!" + ANSI_RESET);
		System.out.println(ANSI_GREEN_BACKGROUND + "This text will have a green background!" + ANSI_RESET);
		System.out.println(ANSI_BLUE_BACKGROUND + "This text will have a blue background!" + ANSI_RESET);
		System.out.println(ANSI_YELLOW_BACKGROUND + "This text will have a yellow background!" + ANSI_RESET);
		System.out.println(ANSI_PURPLE_BACKGROUND + "This text will have a purple background!" + ANSI_RESET);
		System.out.println(ANSI_CYAN_BACKGROUND + "This text will have a cyan background!" + ANSI_RESET);
		System.out.println(ANSI_WHITE_BACKGROUND + "This text will have a white background!" + ANSI_RESET);
		System.out.println(ANSI_BOLD + "This text will be bold!" + ANSI_RESET);
		System.out.println(ANSI_ITALIC + "This text will be italic!" + ANSI_RESET);
		System.out.println(ANSI_UNDERLINE + "This text will be underlined!" + ANSI_RESET);
		System.out.println(ANSI_REVERSE + "This text will be reversed!" + ANSI_RESET);
		System.out.println(ANSI_INVISIBLE + "This text will be invisible!" + ANSI_RESET);
	}
}
