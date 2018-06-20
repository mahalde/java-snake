package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Snake extends GameObject {

	protected boolean running = false;
	private char movingDir = 'd';
	private static int startX;
	private static int startY;
	private static char symbol = 'O';
	private int speed = 1000;

	public Snake(int width, int height, ArrayList<int[]> positionWall) {
		startX = width / 2;
		startY = height / 2;
		coordinate[0] = startY;
		coordinate[1] = startX;
		position.add(coordinate);
	}

	// KeyReader um die Richtung der Schlange zu bestimmen
	public void keyReader() throws IOException {
		String directionString = Character.toString(getMovingDir());

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		long startTime = System.currentTimeMillis();

		// Geschwindigkeitseinstellung der Schlange
		if (position.size() < 5) {
			speed = 750;
		} else if (position.size() < 15) {
			speed = 500;
		} else if (position.size() < 25) {
			speed = 250;
		} else {
			speed = 200;
		}

		while ((System.currentTimeMillis() - startTime) < speed && !in.ready()) {
		}
		if (in.ready()) {
			directionString = in.readLine();
		}

		char direction;
		try {
			direction = directionString.charAt(0);
		} catch (Exception e) {
			direction = this.getMovingDir();
		}

		if (direction == 'w') {
			if (this.getMovingDir() != 's') {
				this.setMovingDir('w');
			}
		} else if (direction == 'a') {
			if (this.getMovingDir() != 'd') {
				this.setMovingDir('a');
			}
		} else if (direction == 's') {
			if (this.getMovingDir() != 'w') {
				this.setMovingDir('s');
			}
		} else if (direction == 'd') {
			if (this.getMovingDir() != 'a') {
				this.setMovingDir('d');
			}
		} else {
			this.setMovingDir(this.getMovingDir());
		}
	}

	// Bewegt die Schlange
	public void move(boolean fruitHit) {
		int[] oldPosition = position.get(0);
		int[] newPosition = new int[2];
		if (this.getMovingDir() == 'w') {
			newPosition[0] = oldPosition[0] - 1;
			newPosition[1] = oldPosition[1];
		} else if (this.getMovingDir() == 'a') {
			newPosition[0] = oldPosition[0];
			newPosition[1] = oldPosition[1] - 1;
		} else if (this.getMovingDir() == 's') {
			newPosition[0] = oldPosition[0] + 1;
			newPosition[1] = oldPosition[1];
		} else if (this.getMovingDir() == 'd') {
			newPosition[0] = oldPosition[0];
			newPosition[1] = oldPosition[1] + 1;
		}
		position.add(0, newPosition);
		if (!fruitHit) {
			position.remove(position.size() - 1);
		}
	}

	public boolean isRunning() {
		return running;
	}

	public void setRunning(boolean running) {
		this.running = running;
	}

	public char getMovingDir() {
		return movingDir;
	}

	public void setMovingDir(char movingDir) {
		this.movingDir = movingDir;
	}

	public static char getSymbol() {
		return symbol;
	}

	public static void setSymbol(char symbol) {
		Snake.symbol = symbol;
	}

	public ArrayList<int[]> getSchlange() {
		return position;

	}

	// Genaue Koordinaten Ausgabe von der Schlange
	public void showSnake() {
		for (int i = 0; i < position.size(); i++) {
			System.out.print((i + 1) + ". S: ");
			for (int j = 0; j < 2; j++) {
				System.out.print(position.get(i)[j] + " ");
			}
			System.out.println();
		}
	}
}
