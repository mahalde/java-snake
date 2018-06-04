package main;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Snake extends GameObject {

	protected boolean running;
	private char movingDir = 'd';
	private static int startX;
	private static int startY;
	private static char symbol = 'O';
	
	public Snake(int width, int height, ArrayList<int[]> positionWall) { /* Konstruktor der Snake */
		startX = width / 2;
		startY = height / 2;
		coordinate[0] = startY;
		coordinate[1] = startX;
		position.add(coordinate);
	}

	public void keyReader() { /* KeyReader um die Richtung der Schlange zu bestimmen */
		while (running) {
			try {
				TimeUnit.MILLISECONDS.sleep(250);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			char direction = IO.readChar();
			if (direction == 'w') {
				if (this.getMovingDir() != 's') {
					this.setMovingDir('w');
				}
			}
			if (direction == 'a') {
				if (this.getMovingDir() != 'd') {
					this.setMovingDir('a');
				}
			}
			if (direction == 's') {
				if (this.getMovingDir() != 'w') {
					this.setMovingDir('s');
				}
			}
			if (direction == 'd') {
				if (this.getMovingDir() != 'a') {
					this.setMovingDir('d');
				}
			}
		}
	}
	
	private void move() { /* TODO: Snake soll sich in gew�nschte Richtung bewegen + position muss geupdated werden */
		
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
	
	public ArrayList<int[]> getSchlange(){
		return position;
		
	}
	
	public void showSnake() { /* Genaue Koordinaten Ausgabe von der Schlange */
		 for(int i = 0; i < position.size(); i++) {
			 System.out.print((i + 1) + ". S: ");
			for(int j = 0; j < 2; j++) {
				System.out.print(position.get(i)[j] + " ");		
			}
			System.out.println();
		 }
	}
}
