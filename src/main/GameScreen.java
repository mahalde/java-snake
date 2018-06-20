package main;

import java.util.ArrayList;

public class GameScreen {

	/**
	 * Wird benutzt, um zu checken, ob das Spiel fertig ist
	 */
	boolean finish = false;
	char reason;
	boolean fruitHit = false;

	/*
	 * Konstruktor des GameScreen | Bekommt die Settings uebergeben, statt das sie
	 * neu gezogen werden muessen
	 */
	public GameScreen(int width, int height, ArrayList<int[]> positionWall, ArrayList<int[]> positionSnake,
			ArrayList<int[]> positionFruit) {
	}

	/* Visuelle Anzeige des GameScreen */
	public void show(char[][] gameScreen, int snakeLength) {
		for (int i = 0; i < 50; i++) {
			System.out.println();
		}
		System.out.println("Punkte: " + snakeLength);
		for (int i = 0; i < gameScreen.length; i++) {
			for (int j = 0; j < gameScreen[0].length; j++) {
				System.out.print(gameScreen[i][j] + " ");
			}
			System.out.println();
		}
	}

	/* Util Methode, um die Variablen zu checken */
	public void _checkVariables(int width, int height) {
		System.out.println("Hoehe: " + height);
		System.out.println("Breite: " + width);
		char fruit = Fruit.getSymbol();
		char wall = Wall.getSymbol();
		char snake = Snake.getSymbol();
		System.out.println("fruit: " + fruit);
		System.out.println("wall: " + wall);
		System.out.println("snake: " + snake);
	}

	public void update(int width, int height, ArrayList<int[]> positionWall, ArrayList<int[]> positionSnake,
			ArrayList<int[]> positionFruit, Snake snake) {
		/**
		 * Spielfeld Matrix mit Symbolen
		 */
		char[][] gameScreen = new char[height][width];
		snake.move(fruitHit);
		fruitHit = false;
		// Zusammenfuegen der drei ArrayLists in eine char Matrix
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				// Schleife ueber die Position der Wand
				for (int iWall = 0; iWall < positionWall.size(); iWall++) {
					if (i == positionWall.get(iWall)[0] && j == positionWall.get(iWall)[1]) {
						gameScreen[i][j] = Wall.getSymbol();
					}
				}
				// Schleife ueber die Position der Frucht
				for (int iFruit = 0; iFruit < positionFruit.size(); iFruit++) {
					if (i == positionFruit.get(iFruit)[0] && j == positionFruit.get(iFruit)[1]) {
						gameScreen[i][j] = Fruit.getSymbol();
					}
				}
				// Schleife ueber die Position der Schlange
				for (int iSnake = 0; iSnake < positionSnake.size(); iSnake++) {
					// Prueft, ob die Schlange in eine Wand laeuft
					if (i == positionSnake.get(iSnake)[0] && j == positionSnake.get(iSnake)[1]) {
						if (gameScreen[i][j] == Wall.getSymbol()) {
							finish = true;
							reason = 'a';
						}
						if (gameScreen[i][j] == Fruit.getSymbol()) {
							fruitHit = true;
						}
						// Prueft, ob die Schlange in sich selbst laueft
						if (positionSnake.get(iSnake)[0] == positionSnake.get(0)[0]
								&& positionSnake.get(iSnake)[1] == positionSnake.get(0)[1]) {
							if (iSnake != 0) {
								finish = true;
								reason = 'c';
							}
						}

						gameScreen[i][j] = Snake.getSymbol();
					}
				}
			}
		}
		show(gameScreen, snake.getPosition().size());
	}
}
