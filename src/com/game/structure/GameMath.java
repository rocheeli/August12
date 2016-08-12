package com.game.structure;

import java.util.Enumeration;

public class GameMath
{
	private int wins = 0;
	private int losses = 0;
	private int ties = 0;

	public String getGameOutcome(String userChoice, String opponentChoice)
	{
		if (userChoice.equalsIgnoreCase("ROCK"))
		{
			if (opponentChoice.equalsIgnoreCase("PAPER"))
			{
				return "lose";
			} else if (opponentChoice.equalsIgnoreCase("SCISSORS"))
			{
				return "win";
			} else if (opponentChoice.equalsIgnoreCase("ROCK"))
			{
				return "tie";
			}
		} else if (userChoice.equalsIgnoreCase("PAPER"))
		{
			if (opponentChoice.equalsIgnoreCase("ROCK"))
			{
				return "win";
			} else if (opponentChoice.equalsIgnoreCase("SCISSORS"))
			{
				return "lose";
			} else if (opponentChoice.equalsIgnoreCase("PAPER"))
			{
				return "tie";
			}
		} else if (userChoice.equalsIgnoreCase("SCISSORS"))
		{
			if (opponentChoice.equalsIgnoreCase("ROCK"))
			{
				return "lose";
			} else if (opponentChoice.equalsIgnoreCase("PAPER"))
			{
				return "win";
			} else if (opponentChoice.equalsIgnoreCase("SCISSORS"))
			{
				return "tie";
			}

		}
		return null;
	}

	public String getRandomChoice()
	{
		double d = Math.random();

		if (d < .33)
		{
			return "ROCK";
		} else if (d < .66)
		{
			return "PAPER";
		} else
		{
			return "SCISSORS";
		}
	}

	public String notRandomChoice()
	{
		return "SCISSORS";
	}

	public int getWins()
	{
		return wins;
	}

	public int getLosses()
	{
		return losses;
	}

	public int getTies()
	{
		return ties;
	}

}
