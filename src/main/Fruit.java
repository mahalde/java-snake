package main;

import java.util.ArrayList;

public class Fruit extends GameObject {
	
	private static char symbol = '*';

	Fruit(int width, int height, ArrayList<int[]> positionWand, ArrayList<int[]> positionSnake){
		super();
		createFruit(width, height, positionWand, positionSnake);
	}
	
	public void createFruit(int width, int height, ArrayList<int[]> positionWand, ArrayList<int[]> positionSnake) {
		
		// Genaue Koordinaten Ausgabe von der Wand
		// for(int i = 0; i < positionWand.size(); i++) {
		//	 System.out.print(i + ": ");
		//	for(int j = 0; j < 2; j++) {
		//		System.out.print("W: " + positionWand.get(i)[j] + " ");		
		//	}
		//	System.out.println();
		// }
		
		// Genaue Koordinaten Ausgabe von der Schlange
		 for(int i = 0; i < positionSnake.size(); i++) {
			for(int j = 0; j < 2; j++) {
				System.out.print("S: " + positionSnake.get(i)[j] + " ");		
			}
			System.out.println();
		 }
		
		boolean ready = false;
		int randomHeight;
		int randomWidth;
		// System.out.println("WandSize: " + positionWand.size());
		do { // Nimmt sich zwei Zufallszahlen und dann wird geprüft, ob sich dort eine Wall oder Snake befindet, sonst nimmt er zwei neue Zahlen...
			randomHeight = 0 + (int) Math.floor(Math.random()*(height)); // Nimmt eine Zufallszahl zwischen 0 & Height - 1
			randomWidth = 0 + (int) Math.floor(Math.random()*(width)); // Nimmt eine Zufallszahl zwischen 0 & Width - 1
			System.out.println(randomHeight);
			System.out.println(randomWidth);
			System.out.println();
			for(int i = 0; i < (positionWand.size() - 1); i++) {
				if(randomHeight == positionWand.get(i)[0] && randomWidth == positionWand.get(i)[1]) { // Prüft, ob die RandomKoordinate einer WandKoordinate endspricht
					ready = false;
					// System.out.println(randomHeight + " vs. " + positionWand.get(i)[0] + "WARNING WALL");
					// System.out.println(randomWidth + " vs. " + positionWand.get(i)[1] + "WARNING WALL");
					// ready = true;
					break;
				}
				else if(randomHeight == positionSnake.get(i)[0] && randomWidth == positionSnake.get(i)[1]) { // Prüft, ob die RandomKoordinate einer SchlangenKoordinate entspricht
					ready = false;
					// System.out.println(randomHeight + " vs. " + positionSnake.get(i)[0] + "WARNING SNAKE");
					// System.out.println(randomWidth + " vs. " + positionSnake.get(i)[1] + "WARNING SNAKE");
					// ready = true;
					break;
				}
				else {
					ready = true;
					// System.out.println(randomHeight + " vs. " + positionWand.get(i)[0]);
					// System.out.println(randomWidth + " vs. " + positionWand.get(i)[1]);
				}
			}
			// System.out.println("Zahlen: " + randomHeight + " " + randomWidth);
		}while(ready != true);
		// System.out.println("FERTIG: " + randomHeight  + " " + randomWidth);

		
		
		this.coordinate[0] = randomHeight; // Schreibt die Zufallszahl in das Array
		this.coordinate[1] = randomWidth; // Schreibt die Zufallszahl in das Array
		position.add(coordinate); // Koordinaten der Frucht im Zweidimensionalen Array, wobei es nur 2 Spalten geben kann aber unendlich Zeilen

		// System.out.println("Frucht: " + this.coordinate[0] + " " + this.coordinate[1]);	
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
