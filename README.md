# java-snake
A console implementation of the game "Snake" in Java

- main Package
	- Fruit.java
		In der "Fruit.java" entsteht alles zum Spielobjekt "Frucht",
		welches Symbol die Frucht hat, wo sie entsteht und es wird immer vorher gecheckt, 
		dass Sie nicht in einem anderen Objekt erscheint.
		Fruit.java erbt von der Klasse GameObject.java
		
	- GameObject.java
		In der "GameObject.java" werden die drei Spielobjekte: Fruit, Snake und Wall bearbeitet.
		Sie ist die Mutterklasse der drei Objekte und gibt Ihnen Attribute und Methoden.

	- GameScreen.java
		In der "GameScreen.java" entsteht alles zum Objekt "Spielbildschirm",
		wie die drei Spielobjekte verarbeitet werden und was auf dem Bildschirm ausgegeben wird, wenn man im Spiel ist.
	
	- IO.java
		Ist eine Standard In & Out Klasse, um Text ein- und auszugeben.
	
	- Main.java
		In der "Main.java" ist der komplette Spielablauf niedergeschrieben.
		Dort werden Objekte erstellt und verschiedene Ereignisse verarbeitet.
	
	- Snake.java
		In der "Fruit.java" entsteht alles zum Spielobjekt "Schlange",
		welches Symbol die Schlange hat, wo sie entsteht und wie Sie sich bewegt.
		Snake.java erbt von der Klasse GameObject.java

	- Wall.java
		In der "Wall.java" entsteht alles zum Spielobjekt "Wand",
		welches Symbol die Wand hat und wo sie entsteht.


- startScreen Package
	- Credits.java
		In der "Credits.java" entsteht lediglich ein Text,
		der die Credits zu den Entwicklern anzeigt.
	
	- Settings.java
		In der "Settings.java" ensteht alles zu den Einstellungen des Spiels, bis auf die Symbole.
		Dort können vor Spielbeginn die Einstellungen getroffen werden, wie Höhe und Breite des Spielfeldes 
		oder Symbole der einzelnen Spielobjekte. 
	
	- Titlescreen.java
		In der "Titlescreen.java" entsteht alles zum Objekt Titelbildschirm.
		Diese Klasse ist zum Navigieren zu den vier Möglichkeiten: Start, Einstellungen, Credits und Beenden.
