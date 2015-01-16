package com.qualiformed.designpattern.pattern.comportement.strategie;

public class Ajouter implements IStrategie
{
	@Override
	public int execute(int a, int b)
	{
		System.out.println("Appel é Ajouter.execute()");
		return a + b; // Faire une addition de a et b
	}
}
