package com.qualiformed.designpattern.pattern.structure.pont;

import objets_de_base.Coord3D;

public class SphereDessinable extends ObjetGeometriqueDessinable
{

	Coord3D centre;
	double rayon;
	
	public SphereDessinable()
	{
	}

	public SphereDessinable(IDessinateurObjetGeometrique dessinateur, String nom, Coord3D centre, double rayon)
	{
		super(dessinateur);
		this.centre = centre;
		this.rayon = rayon;
		this.setNom(nom);
	}

	@Override
	public void Dessiner()
	{
		dessinateur.dessinerSphere(centre, rayon);
	}

}
