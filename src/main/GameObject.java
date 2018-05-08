package main;

import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class GameObject {

	char symbol;
	ArrayList<int[]> position;
	int[] coordinate;
	
	
	public GameObject() {
	}


	public char getSymbol() {
		return symbol;
	}


	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}


	public ArrayList<int[]> getPosition() {
		return position;
	}


	public void setPosition(ArrayList<int[]> position) {
		this.position = position;
	}


	public int[] getCoordinate() {
		return coordinate;
	}


	public void setCoordinate(int[] coordinate) {
		this.coordinate = coordinate;
	}

	private void key(KeyEvent keyevt) {
		int keyCode = keyevt.getKeyCode();
		
		if (keyCode == KeyEvent.VK_DOWN) {
			System.out.println("Down Key registered!");
		}
	}
}
