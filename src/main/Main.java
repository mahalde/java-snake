package main;

import java.io.IOException;
import java.util.ArrayList;

import screens.EndScreen;
import screens.TitleScreen;

public class Main {

	public static void main(String[] args) {
		TitleScreen screen = new TitleScreen(); /* Erstellt den TitleScreen, dabei folgt die weitere Eingabe der z.B. Einstellung über den User */
		do {
			screen.show();
		} while (screen.getSelected() == 2 || screen.getSelected() == 4);

		if (screen.getSelected() == 3) { /* Wenn "Beenden" ausgewaehlt wurde */
			return;
		}

		String name = IO.readString("Wie ist dein Name: ");
		
		Wall wall = new Wall(screen.getWidth(), screen.getHeight()); /* Erstellt die Wall Position */
		Snake snake = new Snake(screen.getWidth(), screen.getHeight(), wall.getWand()); /* Erstellt die Snake Position */
		Fruit fruit = new Fruit(screen.getWidth(), screen.getHeight(), wall.getWand(), snake.getSchlange()); /* Erstellt die Fruit Position */
		GameScreen game = new GameScreen(screen.getWidth(), screen.getHeight(), wall.getWand(), snake.getSchlange(), fruit.getFrucht()); /* Erstellt ein Objekt des Gamescreen */

		do { /* Updated den GameScreen & holt sich vorher alle benötigten Variablen*/
			if (game.fruitHit == true) {
				fruit.createFruit(screen.getWidth(), screen.getHeight(), wall.getWand(), snake.getSchlange());
			}
			game.update(screen.getWidth(), screen.getHeight(), wall.getWand(), snake.getSchlange(), fruit.getFrucht(), snake);
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
