package Com.BridgeLabz.SnakeandLadder;

import java.util.Random;

public class SnakandKLadder{
	static final int NO_PLAY = 0;
	static final int LADDER = 1;
	static final int SNAKE = 2;
	static int DICECOUNT = 0;
	public static void main(String[] args) {


		int startingPosition = 0;


		System.out.println("Starting Position of the Single Player is : "+startingPosition);
		while(startingPosition<100) {
			Random ran = new Random();
			int dice = ran.nextInt(6)+1;
			System.out.println("dice: "+dice);

			int optionCheck = ran.nextInt(3);
			System.out.println("optionCheck: "+optionCheck);



			if (optionCheck == LADDER) {
				System.out.println("ladder!!!");
				startingPosition = startingPosition + dice;
			}


			else if (optionCheck == SNAKE && startingPosition > dice) {
				System.out.println("snake!!!");
				startingPosition = startingPosition - dice;
			}


			else {
				System.out.println("noPlay!!!");
				startingPosition = startingPosition;
			}
			if(startingPosition<0) {
				startingPosition=0;
			}


			System.out.println("position: "+startingPosition);
		}
	}
}


