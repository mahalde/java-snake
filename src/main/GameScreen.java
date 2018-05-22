package main;

public class GameScreen {
	// TODO Gamescreen inilization zieht sich breite & höhe von Settings
	
	public GameScreen(int width, int height){ // Bekommt die Settings übergeben, statt das sie neu gezogen werden müssen
		char fruit = Fruit.getSymbol();
		char wall = Wall.getSymbol();
		char snake = Snake.getSymbol();
		checkVariables(width, height);
		
	}
	
	public void mergeLayers() { // fügt die 3 GameLayer zusammen
		
	}
	
	public void show() { // show GameScreen
		
	}
	
	public void checkVariables(int width, int height) { // Util Methode, um die Variablen zu checken 
		System.out.println("Breite: " + width);
		System.out.println("Höhe: " + height);
		char fruit = Fruit.getSymbol();
		char wall = Wall.getSymbol();
		char snake = Snake.getSymbol();
		System.out.println("fruit: " + fruit);
		System.out.println("wall: " + wall);
		System.out.println("snake: " + snake);
	}
}
