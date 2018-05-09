package startScreen;

import main.Fruit;
import main.IO;
import main.Snake;
import main.Wall;

public class Settings {

	private int height;
	private int width;
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
		System.out.println("3. Schlangensymbol: " + Snake.getSymbol());
		System.out.println("4. Wandsymbol: " + Wall.getSymbol());
		System.out.println("5. Fruchtsymbol: " + Fruit.getSymbol());
		System.out.println("6. Verlassen");
	}
	
	public void aendern() {
		int change;
		do {
			change = IO.readInt("Was möchten Sie ändern: ");
		}while(change < 1 || change > 6);
		
		switch(change) {
		case 1:
			this.setHeight(IO.readInt("Neue Höhe: "));
			show();
			aendern();
			break;
		case 2:
			this.setWidth(IO.readInt("Neue Breite: "));
			show();
			aendern();
			break;
		case 3:
			Snake.setSymbol(IO.readChar("Neues Schlangensymbol: "));
			show();
			aendern();
			break;
		case 4:
			Wall.setSymbol(IO.readChar("Neues Wandsymbol: "));
			show();
			aendern();
			break;
		case 5:
			Fruit.setSymbol(IO.readChar("Neues Fruchtsymbol: "));
			show();
			aendern();
			break;
		default:
			return;
		
		}
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

}
