package main;

public class GameScreen {
	// TODO Gamescreen inilization zieht sich breite & h�he von Settings
	
	public GameScreen(int width, int height){ // Bekommt die Settings �bergeben, statt das sie neu gezogen werden m�ssen
		char fruit = Fruit.getSymbol();
		char wall = Wall.getSymbol();
		char snake = Snake.getSymbol();
		checkVariables(width, height);
		
	}
	
	public void mergeLayers() { // f�gt die 3 GameLayer zusammen
		
	}
	
	public void show() { // show GameScreen
		
	}
	
	public void checkVariables(int width, int height) { // Util Methode, um die Variablen zu checken 
		System.out.println("Breite: " + width);
		System.out.println("H�he: " + height);
		char fruit = Fruit.getSymbol();
		char wall = Wall.getSymbol();
		char snake = Snake.getSymbol();
		System.out.println("fruit: " + fruit);
		System.out.println("wall: " + wall);
		System.out.println("snake: " + snake);
	}
}
