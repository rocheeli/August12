package com.roshambo.arena;

import com.game.structure.GameMath;

public class PlayRoshambo
{

	public static void main(String[] args)
	{
		GameMath model = new GameMath();
		String choice = model.getRandomChoice();
		System.out.println(choice);
	}

}
