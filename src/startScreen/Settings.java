package startScreen;

import main.Fruit;
import main.IO;
import main.Snake;
import main.Wall;

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
		System.out.println("1. Höhe: " + this.height);
		System.out.println("2. Breite: " + this.width);
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
		
		switch(change) {
		case 1:
			
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		case 5:
			
			break;
		default:
			return;
		
		}
	}
}
