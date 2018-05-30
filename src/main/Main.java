package main;

import java.util.ArrayList;

import startScreen.TitleScreen;

public class Main {
	
	public static void main(String[] args) {
		TitleScreen screen = new TitleScreen(); /* Erstellt den TitleScreen, dabei folgt die weitere Eingabe der z.B. Einstellung über den User */
		do {
			screen.show();
		}while(screen.getSelected() == 2 || screen.getSelected() == 4);
		
		GameScreen game = new GameScreen(screen.getWidth(), screen.getHeight()); /* Erstellt den GameScreen, dabei bekommt er die eingestellten Settings übergeben */
		
		Wall wall = new Wall(screen.getWidth(), screen.getHeight());
		ArrayList<int[]> positionWall = new ArrayList<int[]>();
		positionWall = wall.getWand();
		
		Snake snake = new Snake(screen.getWidth(), screen.getHeight(), positionWall);
		ArrayList<int[]> positionSnake = new ArrayList<int[]>();
		positionSnake = snake.getSchlange();
		
		Fruit fruit = new Fruit(screen.getWidth(), screen.getHeight(), positionWall, positionSnake);
		ArrayList<int[]> positionFruit = new ArrayList<int[]>();
		positionFruit = fruit.getFrucht();
		
	//	wall.showWall();
	//	snake.showSnake();
	//	fruit.showFruit();

	//	Snake snake = new Snake(screen.getWidth(), screen.getHeight());
		
	//	game.checkVariables(screen.getWidth(), screen.getHeight());
	}
	
	
	
}
