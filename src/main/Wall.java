package main;

import java.util.ArrayList;

public class Wall extends GameObject{
	private static char symbol = '#';
	
	Wall(int width, int height){ /* Konstruktor der Wall */
		super();
		createWall(width, height);
	}

	public void createWall(int width, int height) { /* Erstellt die Wand in der ArrayList position */
		int x = 1;
		int y = 1;
		for(int zaehler = 0; zaehler < height; zaehler++) {
			for(int zaehler2 = 0; zaehler2 < width; zaehler2++) {
				if(x == 1 || x == width || y == 1 || y == height) {
					int[] coordinate = new int[2]; /* Neu Instanzierung des Arrays, da man nicht die gleiche Instanz eines Arrays zur Liste hinzufügen sollte */
					coordinate[0] = zaehler;
					coordinate[1] = zaehler2;
					position.add(coordinate); /* Koordinaten der Wand in Zweidimensionalen Array, wobei es nur 2 Spalten geben kann aber unendlich Zeilen */
//					System.out.print(symbol);
				}
				else {
//					System.out.print(" ");
				}
				x++;
			}
//			System.out.println("");
			y++;
			x = 1;
		}	

	}
	
	public static char getSymbol() {
		return symbol;
	}

	public static void setSymbol(char symbol) {
		Wall.symbol = symbol;
	}
	
	public ArrayList<int[]> getWand(){
		return position;
	}
	
	public void showWall() { /* Genaue Koordinaten Ausgabe von der Wand */
		 for(int i = 0; i < position.size(); i++) {
			 System.out.print((i + 1) + ". W: ");
			for(int j = 0; j < 2; j++) {
				System.out.print(position.get(i)[j] + " ");		
			}
			System.out.println();
		 }
	}

}