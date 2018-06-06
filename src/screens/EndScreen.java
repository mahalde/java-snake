package screens;

public class EndScreen {

	public void show(int snakeLength, char reason, String name) {
		this.showGameOver();
		System.out.println();
		switch (reason) {
		case 'a':
			System.out.println("Du bist gegen eine Wand gelaufen!");
			break;
		case 'b':
			System.out.println("Spiel durch Code abgebrochen!");
			break;
		case 'c':
			System.out.println("Du bist gegen deine Schlange gelaufen!");
			break;
		default:
			System.out.println("Spielabbruch: Unerwarteter Fehler!");
			break;
		}
		System.out.print("Dein Punktestand beträgt " + snakeLength + " ");
		if (snakeLength == 1) {
			System.out.println("Punkt!");
		} else {
			System.out.println("Punkte!");
		}
		System.out.println();
		if (snakeLength < 5) {
			System.out.println("Das war keine gute Leistung, " + name + ".");
			System.out.println("Du musst noch mehr üben!");
		} else if (snakeLength < 15) {
			System.out.println("Das ist eine akzeptable Leistung, " + name + ".");
			System.out.println("Mit ein bisschen mehr üben kann die Leistung noch besser werden!");
		} else if (snakeLength < 30) {
			System.out.println("Das ist eine gute Leistung, " + name + ".");
			System.out.println("Du bist auf einem guten Weg!");
		} else {
			System.out.println("Fantastische Leistung, " + name + ".");
			System.out.println("Weiter so, Meister!");
		}

	}

	private void showGameOver() {
		for (int i = 0; i < 50; i++) {
			System.out.println();
		}
		System.out.println("   _____                            ____                 _ ");
		System.out.println("  / ____|                          / __ \\               | |");
		System.out.println(" | |  __  __ _ _ __ ___   ___     | |  | |_   _____ _ __| |");
		System.out.println(" | | |_ |/ _` | '_ ` _ \\ / _ \\    | |  | \\ \\ / / _ \\ '__| |");
		System.out.println(" | |__| | (_| | | | | | |  __/    | |__| |\\ V /  __/ |  |_|");
		System.out.println("  \\_____|\\__,_|_| |_| |_|\\___|     \\____/  \\_/ \\___|_|  (_)");
	}
}
