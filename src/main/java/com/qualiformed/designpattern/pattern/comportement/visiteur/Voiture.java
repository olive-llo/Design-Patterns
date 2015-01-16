package com.qualiformed.designpattern.pattern.comportement.visiteur;

public class Voiture implements IElementDeVoiture
{
	private String nom;
	
	public IElementDeVoiture[] elements;

	public Voiture(String nom)
	{
		super();
		this.nom = nom;
		
		// create new Array of elements
		this.elements = new IElementDeVoiture[] {
				new Roue("avant gauche"), new Roue("avant droite"),
				new Roue("arrière gauche"),
				new Roue("arrière droite"), new Caisse("caisse"),
				new Moteur("moteur") };
	}

	public String getNom()
	{
		return nom;
	}

	@Override
	public void accept(IVisiteurElementDeVoiture visitor)
	{
		for (IElementDeVoiture elem : elements)
		{
			elem.accept(visitor);
		}
		visitor.visit(this);
	}
}
