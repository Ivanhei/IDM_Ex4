import java.util.Random;
import java.util.Scanner;

class Die {
	private int faceValue;

	public int getFaceValue() {return faceValue;}

	public void roll() {faceValue = (int)(Math.random() * 6 + 1);}
}

//<<<<<<< HEAD
//=======
class Player {
	private String name;

	Player(String name) {
		this.name = name;
	}

	public String getName() {return this.name;}
}
//>>>>>>> experimental

public class DiceGame {
	private int sum;
	Die die1, die2;

	public DiceGame() {
		die1 = new Die();
		die2 = new Die();
	}

	public void play() {
		die1.roll();
		die2.roll();
	}

	public int getSum() {
		sum = die1.getFaceValue() + die2.getFaceValue();
		return sum;
	}

	public static void main(String args[]) {
		System.out.println("What is your name?");
		Scanner in = new Scanner(System.in);
		String name = in.next();
		Player player1 = new Player(name);
		System.out.println("Hello, " + player1.getName() + "!");

		System.out.println("Rolling the dice...");
		DiceGame playGame = new DiceGame();
		playGame.play();
		System.out.println("Die 1: " + playGame.die1.getFaceValue());
		System.out.println("Die 2: " + playGame.die2.getFaceValue());
		System.out.println("Total value: " + playGame.getSum());

		if(playGame.getSum() > 7) System.out.println(player1.getName() + " won!");
		else System.out.println(player1.getName() + " lost!");
	}
}