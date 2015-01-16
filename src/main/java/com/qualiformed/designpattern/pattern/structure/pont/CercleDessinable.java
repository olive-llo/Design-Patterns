package com.qualiformed.designpattern.pattern.structure.pont;

import objets_de_base.Coord2D;

public class CercleDessinable extends ObjetGeometriqueDessinable
{
	Coord2D centre;
	double rayon;
	
	public CercleDessinable()
	{
	}

	public CercleDessinable(IDessinateurObjetGeometrique dessinateur,
			                String nom,
			                Coord2D centre,
			                double rayon)
	{
		super(dessinateur);
		
		setNom(nom);
		this.centre = centre;
		this.rayon = rayon;
	}

	//L'objet délégue la méthode pour se dessiner é l'objet dessinateur
	@Override
	public void Dessiner()
	{
		dessinateur.dessinerCercle(centre, rayon);
	}
}
