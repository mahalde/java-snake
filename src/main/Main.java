package main;

import java.io.IOException;
import java.util.ArrayList;

import screens.EndScreen;
import screens.TitleScreen;

public class Main {

	public static void main(String[] args) {
		/* Erstellt den TitleScreen, dabei folgt die weitere Eingabe der Einstellungen
		   ueber den User */
		TitleScreen screen = new TitleScreen();
		do {
			screen.show();
		} while (screen.getSelected() == 2 || screen.getSelected() == 4);

		if (screen.getSelected() == 3) { // Wenn "Beenden" ausgewaehlt wurde
			return;
		}

		String name = IO.readString("Wie ist dein Name: ");

		// Erstellt die Wall Position
		Wall wall = new Wall(screen.getWidth(), screen.getHeight());
		ArrayList<int[]> positionWall = new ArrayList<int[]>();
		positionWall = wall.getWand();

		// Erstellt die Snake Position
		Snake snake = new Snake(screen.getWidth(), screen.getHeight(), positionWall);
		ArrayList<int[]> positionSnake = new ArrayList<int[]>();
		positionSnake = snake.getSchlange();

		// Erstellt die Fruit Position
		Fruit fruit = new Fruit(screen.getWidth(), screen.getHeight(), positionWall, positionSnake);
		ArrayList<int[]> positionFruit = new ArrayList<int[]>();
		positionFruit = fruit.getFrucht();

		// Erstellt ein Objekt des Gamescreen
		GameScreen game = new GameScreen(screen.getWidth(), screen.getHeight(), positionWall, positionSnake,
				positionFruit);

		// Updated den GameScreen & holt sich vorher alle benötigten Variablen
		do {

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
		endScreen.show(snake.getPosition().size(), game.reason, name);
	}

}
