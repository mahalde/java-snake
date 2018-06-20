package main;

import java.util.ArrayList;

public class GameObject {

	/**
	 * Koordinatenpaar als ( y | x )
	 */
	int[] coordinate = new int[2];
	
	/**
	 * ArrayList, 2 dimensional dargestellt durch int-Array
	 */
	ArrayList<int[]> position = new ArrayList<int[]>();

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
}
