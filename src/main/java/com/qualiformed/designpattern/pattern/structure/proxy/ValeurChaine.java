package com.qualiformed.designpattern.pattern.structure.proxy;

public class ValeurChaine implements IColonneValue
{
	String val;
	
	@Override
	public IColonneValue fromString(String valeur)
	{
		val = valeur;
		return this;
	}

	@Override
	public String toString()
	{
		return val;
	}

	@Override
	public ValeurChaine clone() throws CloneNotSupportedException
	{
		ValeurChaine result = (ValeurChaine) super.clone();
		result.val = val;
		return result; 
		
	}
}
