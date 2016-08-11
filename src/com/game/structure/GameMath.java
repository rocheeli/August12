package com.game.structure;

import java.util.Enumeration;

public class GameMath
{

	private int wins = 0;
	private int losses = 0;
	private int ties = 0;
	
	public static enum GameOutcome
	{
		WIN, LOSE, TIE
	}
	
	public GameOutcome getGameOutcome (String userChoice, String computerChoice)
	{	
		if(userChoice.equalsIgnoreCase("ROCK"))
		{
			if(computerChoice.equalsIgnoreCase("PAPER"))
			{
				losses ++;
				return GameOutcome.LOSE;
			}
			else if(computerChoice.equalsIgnoreCase("SCISSORS"))
			{
				wins ++;
				return GameOutcome.WIN;
			}
			else if(computerChoice.equalsIgnoreCase("ROCK"))
			{
				ties ++;
				return GameOutcome.TIE;
			}
			}
		else if(userChoice.equalsIgnoreCase("PAPER"))
		{
			if(computerChoice.equalsIgnoreCase("ROCK"))
			{
				wins ++;
				return GameOutcome.WIN;
			}
			else if(computerChoice.equalsIgnoreCase("SCISSORS"))
			{
				losses ++;
				return GameOutcome.LOSE;
			}
			else if(computerChoice.equalsIgnoreCase("PAPER"))
			{
				ties ++;
				return GameOutcome.TIE;
			}
		}
		else if(userChoice.equalsIgnoreCase("SCISSORS"))
		{
			if(computerChoice.equalsIgnoreCase("ROCK"))
			{
				losses ++;
				return GameOutcome.LOSE;
			}
			else if(computerChoice.equalsIgnoreCase("PAPER"))
			{
				wins ++;
				return GameOutcome.WIN;
			}
			else if(computerChoice.equalsIgnoreCase("SCISSORS"))
			{
				ties ++;
				return GameOutcome.TIE;
			}
		
		}
		return null;
		}//method
	
	public String getRandomChoice	()
	{
		double d = Math.random();

		if(d< .33)
		{
			return "ROCK";
		}
		else if(d< .66)
		{
			return "PAPER";
		}
		else
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
	
	}//class
	
	

