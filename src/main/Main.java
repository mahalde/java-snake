package main;

import startScreen.TitleScreen;

public class Main {
	
	public static void main(String[] args) {
		TitleScreen screen = new TitleScreen();
		do {
			screen.show();
		}while(screen.getSelected() == 2 || screen.getSelected() == 4);
		

	}
	
}
