package startScreen;

import main.Snake;
import sz.IO;

public class Settings {

	int height;
	int width;
	public Settings() {
		show();
		aendern();
	}

	public void show() {
		TitleScreen.showSnake();
		System.out.println("      Einstellungen");
		System.out.println();
		System.out.println("1. Höhe(Symbole): " + this.height);
		System.out.println("2. Breite(Symbole): " + this.width);
		System.out.println("3. Schlangen Symbol: " + Snake.getSymbol());
		System.out.println("4. Wand Symbol: " + Wall.getSymbol());
		System.out.println("5. Frucht Symbol: " + Fruit.getSymbol());
		System.out.println("6. Verlassen");
	}
	
	public void aendern() {
		int change;
		do {
			change = IO.readInt("Was möchten Sie ändern: ");
		}while(change < 1 || change > 6);
		
		
	}
}
