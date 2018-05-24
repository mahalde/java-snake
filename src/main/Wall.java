package main;

public class Wall extends GameObject{
	private static char symbol = '#';
	
	Wall(int width, int height){
		super();
		createWall(width, height);
	}

	public void createWall(int width, int height) {
		int x = 1;
		int y = 1;
		for(int zaehler = 0; zaehler < height; zaehler++) {
			for(int zaehler2 = 0; zaehler2 < width; zaehler2++) {
				if(x == 1 || x == height || y == 1 || y == width) {
					this.coordinate[0] = zaehler;
					this.coordinate[1] = zaehler2;
					position.add(coordinate);
				}
				else {
				}
				x++;
			}
			y++;
			x = 1;
		}	
			System.out.println(position.get(1)[1]);	
	}
	
	public static char getSymbol() {
		return symbol;
	}

	public static void setSymbol(char symbol) {
		Wall.symbol = symbol;
	}

}