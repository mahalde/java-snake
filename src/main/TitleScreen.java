package main;

public class TitleScreen {

	int selected;
	String selectionSymbol;
	String curSelection;
	

	public TitleScreen() {
		this.selected = 0;
		this.selectionSymbol = " <-";
	}
	
	public void show() {
		System.out.println("   _____             _        ");
		System.out.println("  / ____|           | |       ");
		System.out.println(" | (___  _ __   __ _| | _____ ");
		System.out.println("  \\___ \\| '_ \\ / _` | |/ / _ \\");
		System.out.println("  ____) | | | | (_| |   <  __/");
		System.out.println(" |_____/|_| |_|\\__,_|_|\\_\\___|");
		System.out.println();
		switch(selected) {
		case 0:
			curSelection = ("Start" + selectionSymbol);
			System.out.println(curSelection);
			System.out.println("Einstellungen");
			break;
		case 1:
			System.out.println("Start");
			curSelection = ("Einstellungen" + selectionSymbol);
			break;
		}

	}
	
	public int getSelected() {
		return selected;
	}

	public void setSelected(int selected) {
		this.selected = selected;
	}

	public String getSelectionSymbol() {
		return selectionSymbol;
	}

	public void setSelectionSymbol(String selectionSymbol) {
		this.selectionSymbol = selectionSymbol;
	}


}
