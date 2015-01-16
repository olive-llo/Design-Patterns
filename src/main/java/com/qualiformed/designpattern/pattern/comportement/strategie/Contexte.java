package com.qualiformed.designpattern.pattern.comportement.strategie;

public class Contexte
{
	private IStrategie strategie;

	public Contexte(IStrategie strategy)
	{
		this.strategie = strategy;
	}

	public int executerStrategie(int a, int b)
	{
		return this.strategie.execute(a, b);
	}
}
