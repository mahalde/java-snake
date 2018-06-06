package main;

import java.io.IOException;
import java.util.ArrayList;

import screens.EndScreen;
import screens.TitleScreen;

public class Main {

	public static void main(String[] args) {
		TitleScreen screen = new TitleScreen(); /*
												 * Erstellt den TitleScreen, dabei folgt die weitere Eingabe der z.B.
												 * Einstellung über den User
												 */
		do {
			screen.show();
		} while (screen.getSelected() == 2 || screen.getSelected() == 4);

		if (screen.getSelected() == 3) { /* Wenn "Beenden" ausgewaehlt wurde */
			return;
		}

		Wall wall = new Wall(screen.getWidth(), screen.getHeight()); /* Erstellt die Wall Position */
		ArrayList<int[]> positionWall = new ArrayList<int[]>();
		positionWall = wall.getWand();

		Snake snake = new Snake(screen.getWidth(), screen.getHeight(), positionWall); /* Erstellt die Snake Position */
		ArrayList<int[]> positionSnake = new ArrayList<int[]>();
		positionSnake = snake.getSchlange();

		Fruit fruit = new Fruit(screen.getWidth(), screen.getHeight(), positionWall,
				positionSnake); /* Erstellt die Fruit Position */
		ArrayList<int[]> positionFruit = new ArrayList<int[]>();
		positionFruit = fruit.getFrucht();

		GameScreen game = new GameScreen(screen.getWidth(), screen.getHeight(), positionWall, positionSnake,
				positionFruit); /* Erstellt ein Objekt des Gamescreen */

		do { /* Updated den GameScreen & holt sich vorher alle benötigten Variablen*/

			positionWall = wall.getWand();
			positionSnake = snake.getSchlange();
			positionFruit = fruit.getFrucht();
			if (game.fruitHit == true) {
				fruit.createFruit(screen.getWidth(), screen.getHeight(), positionWall, positionSnake);
			}
			game.update(screen.getWidth(), screen.getHeight(), positionWall, positionSnake, positionFruit, snake);
			try {
				snake.keyReader();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} while (game.finish != true);

		snake.running = false;
		EndScreen endScreen = new EndScreen();
		endScreen.show(snake.getPosition().size(), game.reason);
	}

}
