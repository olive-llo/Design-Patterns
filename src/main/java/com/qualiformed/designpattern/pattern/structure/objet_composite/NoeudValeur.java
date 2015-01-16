package com.qualiformed.designpattern.pattern.structure.objet_composite;

public class NoeudValeur implements INoeudValeur
{
	String valeur;
	
	public NoeudValeur()
	{
	}

	public NoeudValeur(String valeur)
	{
		this.valeur = valeur;
	}

	@Override
	public String toString()
	{
		return valeur;
	}
}
