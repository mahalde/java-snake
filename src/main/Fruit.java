package main;

public class Fruit extends GameObject {
	
	private static char symbol = '*';

	Fruit(int width, int height){
		super();
		createFruit(width, height);
	}
	
	public void createFruit(int width, int height) {
		int randomWidth = 0 + (int) Math.floor(Math.random()*((width - 1) - 0 + 1)); // Nimmt eine Zufallszahl zwischen 0 & Width - 1
		int randomHeight = 0 + (int) Math.floor(Math.random()*((height - 1) - 0 + 1)); // Nimmt eine Zufallszahl zwischen 0 & Height - 1
		this.coordinate[0] = randomWidth; // Schreibt die Zufallszahl in das Array
		this.coordinate[1] = randomHeight; // Schreibt die Zufallszahl in das Array
		position.add(coordinate); // Koordinaten im Zweidimensionalen Array, wobei es nur 2 Spalten geben kann aber unendlich Zeilen

		// System.out.println(this.coordinate[0] + " " + this.coordinate[1]);	

	}
	
	public static char getSymbol() {
		return symbol;
	}

	public static void setSymbol(char symbol) {
		Fruit.symbol = symbol;
	}
	
}
