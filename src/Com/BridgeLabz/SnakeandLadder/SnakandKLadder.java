package Com.BridgeLabz.SnakeandLadder;

import java.util.Random;

public class SnakandKLadder{
	static final int STARTING_POSITION = 0;
	public static void main(String[] args) {
		int startingPosition = 0;

		System.out.println("Welcome to the Snake and ladder program ");
		System.out.println("Starting Position of the Single Player is : "+startingPosition);
		Random ran = new Random();
		int dice = ran.nextInt(6)+1;
		System.out.println("dice: "+dice);
	}
}

