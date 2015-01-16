package com.qualiformed.designpattern.pattern.creation.builder;

public abstract class BuilderMaison
{
	protected Maison maison;

	public Maison getMaison()
	{
		return maison;
	}

	public void creerNouvelleMaison()
	{
		maison = new Maison();
	}

	public abstract void MonterPlancher();
	public abstract void MonterMurs();
	public abstract void MonterToiture();
}
