package com.game.structure;

public final class Validation
{
	public static boolean isValidOpponent(String opponentChoice)
	{
		boolean validSelection = true;
		String[] validEntries =
		{ "Tucker", "Beth", "Adam" };

		for (int i = 0; i < validEntries.length; i++)
		{
			if (opponentChoice.equalsIgnoreCase(validEntries[i].toString()))
			{
				validSelection = false;

			}
		}
		if (validSelection)
		{
			System.out.println("This is not a valid entry.  Please try again.");
		}
		return validSelection;

	}

	public static boolean isValidWeapon(String userChoice)
	{
		boolean validSelection = true;
		String[] validEntries =
		{ "Rock", "Paper", "Scissors" };

		for (int i = 0; i < validEntries.length; i++)
		{
			if (userChoice.equalsIgnoreCase(validEntries[i].toString()))
			{
				validSelection = false;

			}
		}
		if (validSelection)
		{
			System.out.println("This is not a valid entry.  Please try again.");
		}
		return validSelection;

	}

	public static boolean isValidEntry(String playAgain)
	{
		boolean validSelection = true;
		String[] validEntries =
		{ "Yes", "No" };

		for (int i = 0; i < validEntries.length; i++)
		{
			if (playAgain.equalsIgnoreCase(validEntries[i].toString()))
			{
				validSelection = false;

			}
		}
		if (validSelection)
		{
			System.out.println("This is not a valid entry.  Please try again.");
		}
		return validSelection;

	}

}
