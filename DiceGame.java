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
	public DiceGame playGame;

	Player(String name) {
		this.name = name;
	}

	public String getName() {return this.name;}

	public void playGame() {
		System.out.println(this.name+ " is rolling the dice...");
		playGame = new DiceGame();
		playGame.play();
		System.out.println("Die 1: " + playGame.die1.getFaceValue());
		System.out.println("Die 2: " + playGame.die2.getFaceValue());
		System.out.println("The total value " +this.name+ " got is " + playGame.getSum());
		System.out.println();
	}
}
//>>>>>>> experimental

class CreatePlayer {
	Player[] player;

	CreatePlayer(int number) {
		player = new Player[number];
		for (int i = 0; i < number; i++) {
			player[i] = new Player("player"+(i+1));
			//System.out.println("Please enter player"+(i+1)+"'s name");
			//Scanner in = new Scanner(System.in);
			//player[i] = new Player(in.next());
		}
	}
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
		int flag = 0, max = 0;

		System.out.println("What is your name?");
		Scanner in1 = new Scanner(System.in);
		String name = in1.next();
		Player player1 = new Player(name);
		/*System.out.println("What is your opponent's name?");
		Scanner in2 = new Scanner(System.in);
		name = in2.next();
		Player player2 = new Player(name);*/
		System.out.println("Please enter the number of players in this game:");
		Scanner in = new Scanner(System.in);
		int number_of_player = in.nextInt();
		CreatePlayer players = new CreatePlayer(number_of_player);
		System.out.println("Hello " +player1.getName()+ "!");
		System.out.println("Have fun!");
		System.out.println();

		for (int i = 0; i < number_of_player; i++) {
			players.player[i].playGame();
		}
		
		player1.playGame();

		for (int i = 0; i < number_of_player; i++) {
			if(players.player[i].playGame.getSum() > 7) System.out.println(players.player[i].getName() + " won!");
			if(players.player[i].playGame.getSum() >= max) {
				max = players.player[i].playGame.getSum();
				flag = i;
			}
		}

		if(player1.playGame.getSum() > 7) System.out.println(player1.getName() + " won!");
		if(player1.playGame.getSum() >= max) System.out.println("Congratulations! " +player1.getName()+ " got the highest total value!");
			else System.out.println("Congratulations! " +players.player[flag].getName()+ " got the highest total value!");
	}
}