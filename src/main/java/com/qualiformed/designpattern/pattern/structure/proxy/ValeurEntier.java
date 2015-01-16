package com.qualiformed.designpattern.pattern.structure.proxy;

public class ValeurEntier implements IColonneValue
{
	int val;
	
	@Override
	public IColonneValue fromString(String valeur)
	{
		val = Integer.parseInt(valeur);
		return this;
	}

	@Override
	public String toString()
	{
		return ((Integer)val).toString();
	}

	@Override
	public ValeurEntier clone() throws CloneNotSupportedException
	{
		ValeurEntier result = (ValeurEntier) super.clone();
		result.val = val;
		return result; 
		
	}
}
