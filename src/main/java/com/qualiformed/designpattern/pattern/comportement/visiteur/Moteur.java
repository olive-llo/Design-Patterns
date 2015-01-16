package com.qualiformed.designpattern.pattern.comportement.visiteur;

public class Moteur implements IElementDeVoiture
{
	private String nom;
	
	public Moteur(String nom)
	{
		this.nom = nom;
	}

	public String getNom()
	{
		return nom;
	}
	
	@Override
	public void accept(IVisiteurElementDeVoiture v)
	{
		v.visit(this);
	}
}
