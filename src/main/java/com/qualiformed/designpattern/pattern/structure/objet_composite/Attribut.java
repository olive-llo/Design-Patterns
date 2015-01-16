package com.qualiformed.designpattern.pattern.structure.objet_composite;

public class Attribut implements IAttribut
{
	String valeur;
	
	public Attribut()
	{
		valeur = "";
	}

	public Attribut(String valeur)
	{
		this.valeur = valeur;
	}

	@Override
	public void setValue(String valeur)
	{
		this.valeur = valeur;
	}

	@Override
	public String getValue()
	{
		return valeur;
	}

}
