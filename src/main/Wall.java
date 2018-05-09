package main;

public class Wall extends GameObject {

	private static char symbol = '#';
	
	public Wall() {
		super();
	}

	public static char getSymbol() {
		return symbol;
	}

	public static void setSymbol(char symbol) {
		Wall.symbol = symbol;
	}

	
}