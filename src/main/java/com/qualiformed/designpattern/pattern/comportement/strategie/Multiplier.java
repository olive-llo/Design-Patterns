package com.qualiformed.designpattern.pattern.comportement.strategie;

public class Multiplier implements IStrategie
{

	@Override
	public int execute(int a, int b)
	{
		System.out.println("Appel é Multiplier.execute()");
		return a * b; // Faire une multiplication de a et b
	}

}
