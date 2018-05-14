package startScreen;

import main.Fruit;
import main.IO;
import main.Snake;
import main.Wall;

public class Settings extends main.Main{

	private int height = 15;
	private int width = 15;
	public Settings() {
		show();
		aendern();
	}

	public void show() {	
		System.out.println("      Einstellungen");
		showSettings();
		System.out.println("         Einstellungen");
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
			do {
				this.setHeight(IO.readInt("Neue Höhe(10 - 30): "));
			}while(this.getHeight() < 10 || this.getHeight() > 30);
			break;
		case 2:
			do {
				this.setWidth(IO.readInt("Neue Breite(10 - 30): "));
			}while(this.getWidth() < 10 || this.getWidth() > 30);
			break;
		case 3:
			Snake.setSymbol(IO.readChar("Neues Schlangensymbol: "));
			break;
		case 4:
			Wall.setSymbol(IO.readChar("Neues Wandsymbol: "));
			break;
		case 5:
			Fruit.setSymbol(IO.readChar("Neues Fruchtsymbol: "));
			break;
		default:
			
			// returning back to TitleScreen (show?)
			break;
		}
		
		show();
		aendern();
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
	
	void showSettings(){
		System.out.println("  ______ _           _       _ _                              ");
		System.out.println(" |  ____(_)         | |     | | |                             ");
		System.out.println(" | |__   _ _ __  ___| |_ ___| | |_   _ _ __   __ _  ___ _ __  ");
		System.out.println(" |  __| | | '_ \\/ __| __/ _ \\ | | | | | '_ \\ / _` |/ _ \\ '_ \\ ");
		System.out.println(" | |____| | | | \\__ \\ ||  __/ | | |_| | | | | (_| |  __/ | | |");
		System.out.println(" |______|_|_| |_|___/\\__\\___|_|_|\\__,_|_| |_|\\__, |\\___|_| |_|");
		System.out.println("                                              __/ |           ");
		System.out.println("                                             |___/            ");
	}

}
