package main;

import java.util.ArrayList;

import startScreen.TitleScreen;

public class Main {
	
	public static void main(String[] args) {
		TitleScreen screen = new TitleScreen(); /* Erstellt den TitleScreen, dabei folgt die weitere Eingabe der z.B. Einstellung �ber den User */
		do {
			screen.show();
		}while(screen.getSelected() == 2 || screen.getSelected() == 4);
		
		if(screen.getSelected() == 3) { /* Wenn "Beenden" ausgew�hlt wurde */
			return;
		}
		
		Wall wall = new Wall(screen.getWidth(), screen.getHeight()); /* Erstellt die Wall Position */
		ArrayList<int[]> positionWall = new ArrayList<int[]>();
		positionWall = wall.getWand();
		
		Snake snake = new Snake(screen.getWidth(), screen.getHeight(), positionWall); /* Erstellt die Snake Position */
		ArrayList<int[]> positionSnake = new ArrayList<int[]>();
		positionSnake = snake.getSchlange();
		
		Fruit fruit = new Fruit(screen.getWidth(), screen.getHeight(), positionWall, positionSnake); /* Erstellt die Fruit Position */
		ArrayList<int[]> positionFruit = new ArrayList<int[]>();
		positionFruit = fruit.getFrucht();
		
		GameScreen game = new GameScreen(screen.getWidth(), screen.getHeight(), positionWall, positionSnake, positionFruit); /* Erstellt ein Objekt des Gamescreen */
		
		do { /* Derzeitig endlos Schleife | Soll den Gamescreen alle x Millisekunden updaten */
			positionWall = wall.getWand();
			positionSnake = snake.getSchlange();
			positionFruit = fruit.getFrucht();
			if(game.fruitHit == true) {
				fruit.createFruit(screen.getWidth(), screen.getHeight(), positionWall, positionSnake);
			}
			game.update(screen.getWidth(), screen.getHeight(), positionWall, positionSnake, positionFruit, snake);
		} while(game.finish != true);
		
		switch(game.reason) {
			case 'a':
				System.out.println("Du bist gegen eine Wand gelaufen!");
				break;
			case 'b':
				System.out.println("Spiel durch Code abgebrochen!");
				break;
			case 'c':
				System.out.println("Du bist gegen deine Schlange gelaufen!");
				break;
			default:
				System.out.println("Spielabbruch: Unerwarteter Fehler!");
				break;
		}
		
//		game.checkVariables(screen.getWidth(), screen.getHeight());
	}
	
	
	
}
