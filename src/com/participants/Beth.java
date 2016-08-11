package com.participants;

import com.game.structure.GameMath;

public class Beth extends Opponent
{
	protected boolean isRandom = false;
	GameMath justBeth = new GameMath ();
	String bethsChoice = justBeth.notRandomChoice();
	
	public Beth(String name, boolean randomThrow, boolean isRandom, GameMath justBeth, String bethsChoice)
	{
		super(name, randomThrow);
		this.isRandom = isRandom;
		this.justBeth = justBeth;
		this.bethsChoice = bethsChoice;
	}
	public Beth()
	{
	}
	public boolean isRandom()
	{
		return isRandom;
	}
	public void setRandom(boolean isRandom)
	{
		this.isRandom = isRandom;
	}
	public GameMath getJustBeth()
	{
		return justBeth;
	}
	public void setJustBeth(GameMath justBeth)
	{
		this.justBeth = justBeth;
	}
	public String getBethsChoice()
	{
		return bethsChoice;
	}
	public void setBethsChoice(String bethsChoice)
	{
		this.bethsChoice = bethsChoice;
	}
	
	@Override
	public void takeATurn()
	{

	}
	
	
}
