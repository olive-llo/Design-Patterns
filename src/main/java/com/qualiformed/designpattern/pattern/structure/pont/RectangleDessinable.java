package com.qualiformed.designpattern.pattern.structure.pont;

import objets_de_base.Coord2D;

public class RectangleDessinable extends ObjetGeometriqueDessinable
{

	Coord2D origine;
	double largeur;
	double hauteur;
	
	public RectangleDessinable()
	{
	}

	public RectangleDessinable(IDessinateurObjetGeometrique dessinateur,
							   String nom, Coord2D origine, double largeur, double hauteur)
	{
		super(dessinateur);
		setNom(nom);
		this.origine = origine;
		this.largeur = largeur;
		this.hauteur = hauteur;
	}

	@Override
	public void Dessiner()
	{
		dessinateur.dessinerRectangle(origine, largeur, hauteur);
	}

}
