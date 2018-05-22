package startScreen;

import java.util.concurrent.TimeUnit;

import main.GameScreen;
import main.IO;

public class TitleScreen {
	private int selected = 0;
	Settings settings = new Settings();

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
		} while(selected < 1 || selected > 4); // Begrenzungsabfrage

		
		switch(selected) {
		case 1:
			try {
				new GameScreen(settings.getWidth(), settings.getHeight()); // Erstellt den GameScreen, dabei bekommt er die eingestellten Settings übergeben
			} catch (Exception e1) {
				e1.printStackTrace();
			}

			break;
		case 2:
			do {
				settings.show(); // Zeigt die Einstellungen an
				settings.aendern(); // Öffnet den Änderungsdialog der Einstellungen
			}while(settings.getChange() != 6); // Führt die Einstellungen solange aus, solange der User die Einstellungen nicht verlässt (6 = Verlassen)

			break;
		case 4:
			new Credits(); // Erstellt ein Objekt der Credits (Ist nur eine Textausgabe)
			try {
				TimeUnit.SECONDS.sleep(5); // Wartet 5 Sekunden
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.show(); // Rekursiv zum TitleScreen zurückkehren
			break;
		default: 
			char exit = 0;
			exit = IO.readChar("Bist du sicher(y/n): "); // Sicherheitsabfrage
			if(exit == 'y') {
				showBye();
				return; // Beendet das Spiel.
			}
			else {
				show();
			}
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
	
	public void showBye() {
		for(int i = 0; i < 50; i++) {
			System.out.println();
		}
		System.out.println("                 __  __          ___          _                    _                _ ");
		System.out.println("     /\\         / _| \\ \\        / (_)        | |                  | |              | |");
		System.out.println("    /  \\  _   _| |_   \\ \\  /\\  / / _  ___  __| | ___ _ __ ___  ___| |__   ___ _ __ | |");
		System.out.println("   / /\\ \\| | | |  _|   \\ \\/  \\/ / | |/ _ \\/ _` |/ _ \\ '__/ __|/ _ \\ '_ \\ / _ \\ '_ \\| |");
		System.out.println("  / ____ \\ |_| | |      \\  /\\  /  | |  __/ (_| |  __/ |  \\__ \\  __/ | | |  __/ | | |_|");
		System.out.println(" /_/    \\_\\__,_|_|       \\/  \\/   |_|\\___|\\__,_|\\___|_|  |___/\\___|_| |_|\\___|_| |_(_)");
	}
	
	public int getSelected() {
		return selected;
	}
	
	public void setSelected(int selected) {
		this.selected = selected;
	}
}
