package com.participants;

import com.game.structure.GameMath;

public class Tucker extends Opponent
{
	protected boolean isRandom = true;
	GameMath justTucker = new GameMath ();
	String tuckersChoice = justTucker.getRandomChoice();
	
	public Tucker(String name, boolean randomThrow, boolean isRandom, GameMath justTucker, String tuckersChoice)
	{
		super(name, randomThrow);
		this.isRandom = isRandom;
		this.justTucker = justTucker;
		tuckersChoice = tuckersChoice;
	}
	public Tucker()
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
	public GameMath getJustTucker()
	{
		return justTucker;
	}
	public void setJustTucker(GameMath justTucker)
	{
		this.justTucker = justTucker;
	}
	public String getTuckersChoice()
	{
		return tuckersChoice;
	}
	public void setTuckersChoice(String tuckersChoice)
	{
		tuckersChoice = tuckersChoice;
	}
	
	@Override
	public void takeATurn()
	{

	}
	
	
}
