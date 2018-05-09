package startScreen;

import main.IO;

public class TitleScreen {
	
<<<<<<< HEAD
	public void show() {
=======
	public TitleScreen() {
		show();
	}
	
	public static void show() {
>>>>>>> 9ed921fb8117ad6e8e088707a10f93e03841aadb
		int selected;
		showSnake();
		System.out.println();
		System.out.println("1. Start");
		System.out.println("2. Einstellungen");
		System.out.println("3. Beenden");
		System.out.println("9. Credits");
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
		case 9:
			new Credits();
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
