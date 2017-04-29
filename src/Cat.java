/**
 * Copyright The League of Amazing Programmers 2013-2017 Level 1 Cat
 * Duration=0.5 Platform=Eclipse Type=Recipe Objectives=Create your own object
 */

public class Cat {

	private String name;
	private int lives = 9;

	Cat(String name) {
		this.name = name;
	}

	void meow() {
		System.out.println("meeeeeooooooooooowwwwwwwww!!");
	}

	public void printName() {
		if (name == null)
			System.out.println("I don't know my own name!");
		else
			System.out.println("My name is " + name);
	}

	void kill() {
		lives--;
		if (lives > 0)
			System.out.println("Nice try, but I still have " + lives + " lives left");
		else if (lives < 0)
			System.out.println("That's overkill yo!");
		else
			System.out.println("DEAD CAT :(");
	}
	public void printLives(){
		System.out.println("I have "+ getLives() + " lives left" );
	}
	
	public int getLives(){
		return lives;
	}

	public static void main(String[] args) {
		/* Do the following things without changing the Cat class */

		// 1. Make the Cat meow
		Cat kitty = new Cat("kitty");
		kitty.meow();
		kitty.printLives();
		kitty.getLives();
		System.out.println(kitty.getLives());
		
		// 2. Get the Cat to print it's name
		kitty.printName();
		// 3. Kill the Cat!
		for (int i = 0; i < 10; i++) {
			kitty.kill();
		}
		
	}
}
