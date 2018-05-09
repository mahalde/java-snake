package startScreen;

import main.IO;

public class TitleScreen {
	
	public void show() {
		int selected;
		showSnake();
		System.out.println();
		System.out.println("1. Start");
		System.out.println("2. Einstellungen");
		System.out.println("3. Beenden");
		do {
			selected = IO.readInt("Was möchtest du auswählen: ");
		} while(selected < 1 || selected > 3);

		
		switch(selected) {
		case 1:
			// new GameScreen(); // Erstellt den Gamescreen mit dem Settings
			break;
		case 2:
			new Settings(); // Öffnet die Einstellungen.
			break;
		default: // Beendet das Problem bei anderen Eingaben. (ggf. Ausgabe #3)
			return;
		}
	}
	
	public void showSnake() {
		System.out.println("   _____             _        ");
		System.out.println("  / ____|           | |       ");
		System.out.println(" | (___  _ __   __ _| | _____ ");
		System.out.println("  \\___ \\| '_ \\ / _` | |/ / _ \\");
		System.out.println("  ____) | | | | (_| |   <  __/");
		System.out.println(" |_____/|_| |_|\\__,_|_|\\_\\___|");
	}
}
