package main;

import java.util.ArrayList;

import startScreen.TitleScreen;

public class Main {
	
	public static void main(String[] args) {
		TitleScreen screen = new TitleScreen(); // Erstellt den TitleScreen, dabei folgt die weitere Eingabe der z.B. Einstellung über den User
		do {
			screen.show();
		}while(screen.getSelected() == 2 || screen.getSelected() == 4);
		
		GameScreen game = new GameScreen(screen.getWidth(), screen.getHeight()); // Erstellt den GameScreen, dabei bekommt er die eingestellten Settings übergeben
		
		Wall wall = new Wall(screen.getWidth(), screen.getHeight());
		ArrayList<int[]> positionWand = new ArrayList<int[]>();
		positionWand = wall.getWand();
		Fruit fruit = new Fruit(screen.getWidth(), screen.getHeight(), positionWand);

		// Snake snake = new Snake(screen.getWidth(), screen.getHeight());
		
		// game.checkVariables(screen.getWidth(), screen.getHeight());
	}
	
	
	
}
