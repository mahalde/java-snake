package startScreen;

import main.Fruit;
import main.IO;
import main.Snake;
import main.Wall;

public class Settings {

	private int height = 15;
	private int width = 15;
	public Settings() {
		show();
		aendern();
	}

	public void show() {
		TitleScreen.showSnake();
		System.out.println("         Einstellungen");
		System.out.println();
		System.out.println("1. H�he: " + this.height);
		System.out.println("2. Breite: " + this.width);
		System.out.println("3. Schlangensymbol: " + Snake.getSymbol());
		System.out.println("4. Wandsymbol: " + Wall.getSymbol());
		System.out.println("5. Fruchtsymbol: " + Fruit.getSymbol());
		System.out.println("6. Verlassen");
	}
	
	public void aendern() {
		int change;
		do {
			change = IO.readInt("Was m�chten Sie �ndern: ");
		}while(change < 1 || change > 6);
		
		switch(change) {
		case 1:
			do {
				this.setHeight(IO.readInt("Neue H�he(10 - 30): "));
			}while(this.getHeight() < 10 || this.getHeight() > 30);
			
			show();
			aendern();
			break;
		case 2:
			do {
				this.setWidth(IO.readInt("Neue Breite(10 - 30): "));
			}while(this.getWidth() < 10 || this.getWidth() > 30);
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
			TitleScreen.show();
			break;
		
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
