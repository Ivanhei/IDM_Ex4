import java.util.Random;

class Die {
	private int faceValue;

	public int getFaceValue() {return faceValue;}

	public void roll() {faceValue = (int)(Math.random() * 6 + 1);}
}


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
		System.out.println("Rolling the dice...");
		DiceGame playGame = new DiceGame();
		playGame.play();
		System.out.println("Die 1: " + playGame.die1.getFaceValue());
		System.out.println("Die 2: " + playGame.die2.getFaceValue());
		System.out.println("Total value: " + playGame.getSum());

		if(playGame.getSum() > 7) System.out.println("You won!");
		else System.out.println("You lost!");
	}
}