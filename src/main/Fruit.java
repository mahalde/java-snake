package main;

import java.util.ArrayList;

public class Fruit extends GameObject {
	
	private static char symbol = '*';

	Fruit(int width, int height, ArrayList<int[]> positionWand){
		super();
		createFruit(width, height, positionWand);
	}
	
	public void createFruit(int width, int height, ArrayList<int[]> positionWand) {
		
		// Genaue Koordinaten Ausgabe von der Wand
		for(int i = 1; i < positionWand.size(); i++) {
			for(int j = 0; j < 2; j++) {
				System.out.print(positionWand.get(i)[j] + " ");		
			}
			System.out.println();
		}
		for(int i = 0; i < 20; i++) {
		int randomHeight = 1 + (int) Math.floor(Math.random()*((height - 1) - 1 + 1)); // Nimmt eine Zufallszahl zwischen 0 & Height - 1
		int randomWidth = 1 + (int) Math.floor(Math.random()*((width - 1) - 1 + 1)); // Nimmt eine Zufallszahl zwischen 0 & Width - 1
		this.coordinate[0] = randomHeight; // Schreibt die Zufallszahl in das Array
		this.coordinate[1] = randomWidth; // Schreibt die Zufallszahl in das Array
		position.add(coordinate); // Koordinaten der Frucht im Zweidimensionalen Array, wobei es nur 2 Spalten geben kann aber unendlich Zeilen

		System.out.println("Frucht: " + this.coordinate[0] + " " + this.coordinate[1]);	
		}
	}
	
	public static char getSymbol() {
		return symbol;
	}

	public static void setSymbol(char symbol) {
		Fruit.symbol = symbol;
	}
	
	public ArrayList<int[]> getFrucht(){
		return position;
		
	}
	
}
