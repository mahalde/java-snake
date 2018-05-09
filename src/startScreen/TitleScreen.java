package startScreen;

import main.IO;

public class TitleScreen {
	
	public TitleScreen() {
		show();
	}
	
	public void show() {
		int selected;
		System.out.println("   _____             _        ");
		System.out.println("  / ____|           | |       ");
		System.out.println(" | (___  _ __   __ _| | _____ ");
		System.out.println("  \\___ \\| '_ \\ / _` | |/ / _ \\");
		System.out.println("  ____) | | | | (_| |   <  __/");
		System.out.println(" |_____/|_| |_|\\__,_|_|\\_\\___|");
		System.out.println();
		System.out.println("1. Start");
		System.out.println("2. Einstellungen");
		System.out.println("3. Beenden");
		do {
			selected = IO.readInt("Was möchtest du auswählen: ");
		}while(selected < 1 || selected > 3);

		
		switch(selected) {
		case 1:
			// new Game(); // Erstellt den Gamescreen mit dem Settings
			break;
		case 2:
			new Settings(); // Öffnet die Einstellungen.
			break;
		default: // Beendet das Problem bei anderen Eingaben. (ggf. Ausgabe #3)
			return;
		}
	}
}
