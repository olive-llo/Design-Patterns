package com.qualiformed.designpattern.pattern.structure.poids_mouche;

public class CommandeCafe
{
	Cafe cafe;
	ContexteCommande contexte;
	
	public CommandeCafe()
	{
	}

	public CommandeCafe(Cafe cafe, ContexteCommande contexte)
	{
		this.cafe = cafe;
		this.contexte = contexte;
	}

	public Cafe getCafe()
	{
		return cafe;
	}

	public ContexteCommande getContexte()
	{
		return contexte;
	}
	
}
