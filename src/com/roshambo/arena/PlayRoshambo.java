package com.roshambo.arena;

import java.util.Scanner;

import com.game.structure.GameMath;
import com.game.structure.*;
import com.participants.*;

public class PlayRoshambo
{
	public static void main(String[] args)

	{
		Scanner userInput = new Scanner(System.in);
		GameMath model = new GameMath();
		String opponentThrow = null;
		String opponentChoice = null;
		String userChoice = null;
		String playAgain = null;
		boolean contPlay = true;

		do
		{

			System.out.println("Welcome to the Roshambo arena!  Get ready to play!");
			System.out.println("Please enter your name");
			String userName = userInput.nextLine().toUpperCase();

			do
			{
				System.out.println("Hiya, " + userName + ". Please choose your opponent.");
				System.out.println("Would you like to challenge Adam, Beth, or Tucker?");

				opponentChoice = userInput.nextLine();
			} while (Validation.isValidOpponent(opponentChoice));

			do
			{
				System.out.println("Would you like to throw Rock, Paper, or Scissors?");
				userChoice = userInput.nextLine().toUpperCase();
			} while (Validation.isValidWeapon(userChoice));

			switch (opponentChoice.toUpperCase())
			{
			case "BETH":
				Beth bethInArena = new Beth();
				opponentThrow = bethInArena.getBethsChoice();
				System.out.println("You have picked " + userChoice + ".");
				System.out.println("Beth throws " + (opponentThrow) + ".");
				break;

			case "TUCKER":
				Tucker tuckerInArena = new Tucker();
				opponentThrow = tuckerInArena.getTuckersChoice();
				System.out.println("You have picked " + userChoice + ".");
				System.out.println("Tucker throws " + (opponentThrow) + ".");
				break;

			case "ADAM":
				Adam adamInArena = new Adam();
				opponentThrow = adamInArena.getAdamsChoice();
				System.out.println("You have picked " + userChoice + ".");
				System.out.println("Adam throws " + (opponentThrow) + ".");
				break;

			}
			String arenaOutcome = model.getGameOutcome(userChoice, opponentThrow);
			if (arenaOutcome.equalsIgnoreCase("win"))
			{
				System.out.println("You Win!");
			} else if (arenaOutcome.equalsIgnoreCase("lose"))
			{
				System.out.println("You Lost :(");
			} else if (arenaOutcome.equalsIgnoreCase("tie"))
			{
				System.out.println("You Tied");
			}

			System.out.println();

			do
			{
				System.out.println("Would you like to play again?");
				playAgain = userInput.nextLine();
			} while (Validation.isValidEntry(playAgain));

			if (playAgain.equalsIgnoreCase("no"))
			{
				contPlay = false;
			}
		} while (contPlay);
		userInput.close();
		System.out.println("Thanks for playing!");
		System.exit(0);
	}
}
