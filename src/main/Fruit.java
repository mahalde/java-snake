package main;

public class Fruit extends GameObject {
	
	private static char symbol = '*';

	public static char getSymbol() {
		return symbol;
	}

	public static void setSymbol(char symbol) {
		Fruit.symbol = symbol;
	}
	
}
