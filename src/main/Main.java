package main;

import java.util.ArrayList;

import startScreen.TitleScreen;

public class Main {
	
	public static void main(String[] args) {
		TitleScreen screen = new TitleScreen(); /* Erstellt den TitleScreen, dabei folgt die weitere Eingabe der z.B. Einstellung über den User */
		do {
			screen.show();
		}while(screen.getSelected() == 2 || screen.getSelected() == 4);
		
		if(screen.getSelected() == 3) {
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
		
		// Soll der GameScreen die Sachen auch berechnen oder nur anzeigen ? Sonst könnte man in der Main rechnen, muss aber nicht ------------------
		GameScreen game = new GameScreen(screen.getWidth(), screen.getHeight()); /* TODO: wall, snake, fruit übergeben & damit das Spiel spielen */
		
	//	wall.showWall();
	//	snake.showSnake();
	//	fruit.showFruit();

	//	Snake snake = new Snake(screen.getWidth(), screen.getHeight());
		
	//	game.checkVariables(screen.getWidth(), screen.getHeight());
	}
	
	
	
}
