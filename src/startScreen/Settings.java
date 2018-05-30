package startScreen;

import main.Fruit;
import main.IO;
import main.Snake;
import main.Wall;

public class Settings{
	private int height = 15;
	private int width = 15;
	private int change = 0;
	
	public Settings() {

	}

	public void show() {	
		this.showSettings();
		System.out.println("1. H�he: " + this.height);
		System.out.println("2. Breite: " + this.width);
		System.out.println("3. Schlangensymbol: " + Snake.getSymbol());
		System.out.println("4. Wandsymbol: " + Wall.getSymbol());
		System.out.println("5. Fruchtsymbol: " + Fruit.getSymbol());
		System.out.println("6. Verlassen");
	}
	
	public void aendern() {
		show(); /* Zeigt die Einstellungen */
		do {
			change = IO.readInt("Was m�chten Sie �ndern: ");
		}while(change < 1 || change > 6); /* Begrenzungsabfrage */
		
		switch(change) {
		case 1: /* H�he �ndern */
			do {
				this.setHeight(IO.readInt("Neue H�he(10 - 30): "));
			}while(this.getHeight() < 10 || this.getHeight() > 30); /* Begrenzungsabfrage */
			aendern(); /* Rekursion zur Anzeige des �nderungsdialogs der Einstellungen */
			break;
		case 2: /* Breite �ndern */
			do {
				this.setWidth(IO.readInt("Neue Breite(10 - 30): "));
			}while(this.getWidth() < 10 || this.getWidth() > 30); /* Begrenzungsabfrage */
			aendern(); /* Rekursion zur Anzeige des �nderungsdialogs der Einstellungen */
			break;
		case 3: /* Schlangensymbol �ndern */
			Snake.setSymbol(IO.readChar("Neues Schlangensymbol: "));
			aendern(); /* Rekursion zur Anzeige des �nderungsdialogs der Einstellungen */
			break;
		case 4: /* Wandsymbol �ndern */
			Wall.setSymbol(IO.readChar("Neues Wandsymbol: "));
			aendern(); /* Rekursion zur Anzeige des �nderungsdialogs der Einstellungen */
			break;
		case 5: /* Fruchtsymbol �ndern */
			Fruit.setSymbol(IO.readChar("Neues Fruchtsymbol: "));
			aendern(); /* Rekursion zur Anzeige des �nderungsdialogs der Einstellungen */
			break;
		default: /* Dadurch das nichts ausgef�hrt wird, kehrt er zum TitleScreen zur�ck. */
			break; /* Es ist nicht m�glich, show() & aenderen() danach einzuf�gen, da er sonst nicht zum TitleScreen zur�ckkehrt */
		}
		
	}

	public int getHeight() {
		return this.height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return this.width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getChange() {
		return change;
	}

	public void setChange(int change) {
		this.change = change;
	}

	
	void showSettings(){ /* Zeigt den Einstellungsschriftzug */
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
