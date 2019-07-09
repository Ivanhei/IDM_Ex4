import java.util.Random;

class RollDice {
	private int value;

	public RollDice() {
		value = (int)(Math.random() * 6 + 1);
	}

	public int getValue() {return value;}
}

public class DiceGame {
	private int sum;
	RollDice die1, die2;
	public DiceGame() {
		die1 = new RollDice();
		die2 = new RollDice();
		sum = die1.getValue() + die2.getValue();
	}

	public int getSum() {return sum;}

	public static void main(String args[]) {
		System.out.println("Rolling the dice...");
		DiceGame player = new DiceGame();
		System.out.println("Die 1: " + player.die1.getValue());
		System.out.println("Die 2: " + player.die2.getValue());
		System.out.println("Total value: " + player.getSum());
	}
}