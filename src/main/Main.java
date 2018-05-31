package main;

import java.util.ArrayList;

import startScreen.TitleScreen;

public class Main {
	
	public static void main(String[] args) {
		TitleScreen screen = new TitleScreen(); /* Erstellt den TitleScreen, dabei folgt die weitere Eingabe der z.B. Einstellung über den User */
		do {
			screen.show();
		}while(screen.getSelected() == 2 || screen.getSelected() == 4);
		
		if(screen.getSelected() == 3) { /* Wenn "Beenden" ausgewählt wurde */
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
			game.update(screen.getWidth(), screen.getHeight(), positionWall, positionSnake, positionFruit);
		}while(game.finish != true);
		
		
//		game.checkVariables(screen.getWidth(), screen.getHeight());
	}
	
	
	
}
