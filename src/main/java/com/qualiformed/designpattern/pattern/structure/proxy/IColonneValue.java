package com.qualiformed.designpattern.pattern.structure.proxy;

public interface IColonneValue extends Cloneable
{
	public IColonneValue fromString(String valeur);
	public String toString();
	public IColonneValue clone() throws CloneNotSupportedException;
}
