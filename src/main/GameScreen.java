package main;

import java.util.ArrayList;

public class GameScreen {

	boolean finish = false; /* Boolean, um zu checken ob das Spiel fertig ist */
	char reason;
	boolean fruitHit = false;

	public GameScreen(int width, int height, ArrayList<int[]> positionWall, ArrayList<int[]> positionSnake,
			ArrayList<int[]> positionFruit) { /*
												 * Konstruktor des GameScreen | Bekommt die Settings uebergeben, statt
												 * das sie neu gezogen werden muessen
												 */

	}

	public void show(char[][] gameScreen) { /* Visuelle Anzeige des GameScreen */
		for (int i = 0; i < 50; i++) {
			System.out.println();
		}
		for (int i = 0; i < gameScreen.length; i++) {
			for (int j = 0; j < gameScreen[0].length; j++) {
				System.out.print(gameScreen[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void checkVariables(int width, int height) { /* Util Methode, um die Variablen zu checken */
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
			ArrayList<int[]> positionFruit, Snake snake) { /* Update Gamescreen */
		char[][] gameScreen = new char[height][width]; /* Spielfeld Matrix mit Symbolen */
		snake.move(fruitHit);
		fruitHit = false;
		/* Zusammenfuegen der drei ArrayLists in eine char Matrix */
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				for (int iWall = 0; iWall < positionWall.size(); iWall++) { /* Schleife ueber die Position der Wand */
					if (i == positionWall.get(iWall)[0] && j == positionWall.get(iWall)[1]) {
						gameScreen[i][j] = Wall.getSymbol();
					}
				}
				for (int iFruit = 0; iFruit < positionFruit
						.size(); iFruit++) { /* Schleife ueber die Position der Frucht */
					if (i == positionFruit.get(iFruit)[0] && j == positionFruit.get(iFruit)[1]) {
						gameScreen[i][j] = Fruit.getSymbol();
					}
				}
				for (int iSnake = 0; iSnake < positionSnake
						.size(); iSnake++) { /* Schleife ueber die Position der Schlange */
					if (i == positionSnake.get(iSnake)[0]
							&& j == positionSnake.get(iSnake)[1]) { /* Prueft, ob die Schlange in eine Wand laeuft */
						if (gameScreen[i][j] == Wall.getSymbol()) {
							finish = true;
							reason = 'a';
						}
						if (gameScreen[i][j] == Fruit.getSymbol()) {
							fruitHit = true;
						}
						if (positionSnake.get(iSnake)[0] == positionSnake.get(0)[0] /*
																					 * Prueft, ob die Schlange in sich
																					 * selbst laeuft
																					 */
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

		// reason = 'b';
		// finish = true;
		show(gameScreen);
	}

}
