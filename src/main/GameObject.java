package main;

import java.util.ArrayList;

public class GameObject {


	int[] coordinate = new int[2]; /* x & y Koordinaten */
	ArrayList<int[]> position = new ArrayList<int[]>(); /* ArrayList, 2 dimensional dargestellt durch int-Array */
	
	public GameObject() {
		
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
	
}
