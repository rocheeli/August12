package com.participants;

public class User extends Player
{
	protected boolean isPlaying = true;

	public User(String name, boolean isPlaying)
	{
		super(name);
		this.isPlaying = isPlaying;
	}

	public User()
	{
	}

	public boolean isPlaying()
	{
		return isPlaying;
	}

	public void setPlaying(boolean isPlaying)
	{
		this.isPlaying = isPlaying;
	}

	@Override
	public void takeATurn()
	{
		// TODO Auto-generated method stub
		
	}

	
	
	
}
