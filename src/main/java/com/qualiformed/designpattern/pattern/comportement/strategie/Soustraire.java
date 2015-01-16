package com.qualiformed.designpattern.pattern.comportement.strategie;

public class Soustraire implements IStrategie
{
	@Override
	public int execute(int a, int b)
	{
		System.out.println("Appel é Soustraire.execute()");
		return a - b; // Faire une soustraction de a et b
	}
}
