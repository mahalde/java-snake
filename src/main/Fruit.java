/* Test */
package main;

import java.util.ArrayList;

public class Fruit extends GameObject {
	
	private static char symbol = '*';

	Fruit(int width, int height, ArrayList<int[]> positionWand, ArrayList<int[]> positionSnake){ /* Konstruktor der Fruit */
		super();
		createFruit(width, height, positionWand, positionSnake);
	}
	
	public void createFruit(int width, int height, ArrayList<int[]> positionWand, ArrayList<int[]> positionSnake) { /* Erstellen der Fruit in ArrayList */
	
		if(!position.isEmpty()) {
			position.remove(coordinate);	
		}
		boolean readyWall = false;
		boolean readySnake = false;
		int randomHeight = 0;
		int randomWidth = 0;
		do { /* Nimmt sich zwei Zufallszahlen und dann wird geprueft, ob sich dort eine Wall oder Snake befindet, sonst nimmt er zwei neue Zahlen... */
			randomHeight = 1 + (int) Math.floor(Math.random()*(height - 2)); /* Nimmt eine Zufallszahl zwischen 0 & Height - 2 */
			randomWidth = 1 + (int) Math.floor(Math.random()*(width - 2)); /* Nimmt eine Zufallszahl zwischen 0 & Width - 2 */
			for(int i = 0; i < (positionWand.size() - 1); i++) {
				if(randomHeight == positionWand.get(i)[0] && randomWidth == positionWand.get(i)[1]) { /* Prueft, ob die RandomKoordinate einer WandKoordinate endspricht */
					readyWall = false;
					break;
				}
				else {
					readyWall = true;
				}
			}
			for(int i = 0; i < (positionSnake.size() - 1); i++) {
				if(randomHeight == positionSnake.get(i)[0] && randomWidth == positionSnake.get(i)[1]) { /* Prueft, ob die RandomKoordinate einer SchlangenKoordinate entspricht */
					readySnake = false;
					break;
				}
				else {
					readySnake = true;
				}
			}
		} while(readyWall != true && readySnake != true);

		coordinate[0] = randomHeight; /* Schreibt die Zufallszahl in das Array */
		coordinate[1] = randomWidth; /* Schreibt die Zufallszahl in das Array */
		position.add(coordinate); /* Koordinaten der Frucht im Zweidimensionalen Array, wobei es nur 2 Spalten geben kann aber unendlich Zeilen */
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
	
	public void showFruit() { /* Genaue Koordinaten Ausgabe von der Frucht */
		 for(int i = 0; i < position.size(); i++) {
			 System.out.print((i + 1) + ". F: ");
			for(int j = 0; j < 2; j++) {
				System.out.print(position.get(i)[j] + " ");		
			}
			System.out.println();
		 }
	}
	
}
