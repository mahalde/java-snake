package startScreen;

import java.util.concurrent.TimeUnit;

import main.IO;

public class TitleScreen {
	private int selected = 0;

	public TitleScreen() {

	}
	
	public void show() {
		showSnake();
		System.out.println();
		System.out.println("1. Start");
		System.out.println("2. Einstellungen");
		System.out.println("3. Beenden");
		System.out.println("4. Credits");
		do {
			selected = IO.readInt("Was möchtest du auswählen: ");
		} while(selected < 1 || selected > 4);

		
		switch(selected) {
		case 1:
			// new GameScreen(); // Erstellt den Gamescreen mit dem Settings
			break;
		case 2:
			new Settings(); // Öffnet die Einstellungen. HINT: Er erstellt immer wieder neue Einstellungen, daher werden sie nicht gespeichert.
			break;
		case 4:
			new Credits();
			try {
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.show();
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
	
	public int getSelected() {
		return selected;
	}

	public void setSelected(int selected) {
		this.selected = selected;
	}
}
