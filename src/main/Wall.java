package main;

import java.util.ArrayList;

public class Wall extends GameObject {
	private static char symbol = '#';

	Wall(int width, int height) {
		super();
		createWall(width, height);
	}

	public void createWall(int width, int height) {
		int x = 1;
		int y = 1;
		for (int zaehler = 0; zaehler < height; zaehler++) {
			for (int zaehler2 = 0; zaehler2 < width; zaehler2++) {
				if (x == 1 || x == width || y == 1 || y == height) {
					/*
					 * Neu Instanzierung des Arrays, da man nicht die gleiche Instanz eines Arrays
					 * zur Liste hinzufuegen sollte
					 */
					int[] coordinate = new int[2];
					coordinate[0] = zaehler;
					coordinate[1] = zaehler2;
					/*
					 * Koordinaten der Wand in Zweidimensionalen Array, wobei es nur 2 Spalten geben
					 * kann aber unendlich Zeilen
					 */
					position.add(coordinate);
				}
				x++;
			}
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

	public ArrayList<int[]> getWand() {
		return position;
	}

	// Genaue Koordinaten Ausgabe von der Wand
	public void showWall() {
		for (int i = 0; i < position.size(); i++) {
			System.out.print((i + 1) + ". W: ");
			for (int j = 0; j < 2; j++) {
				System.out.print(position.get(i)[j] + " ");
			}
			System.out.println();
		}
	}
}