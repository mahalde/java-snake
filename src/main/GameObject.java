package main;

import java.util.ArrayList;

public class GameObject {

	ArrayList<int[]> position;
	int[] coordinate;
	
	
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
