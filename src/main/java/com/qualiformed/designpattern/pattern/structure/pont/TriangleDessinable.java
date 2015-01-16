package com.qualiformed.designpattern.pattern.structure.pont;

import objets_de_base.Coord2D;

public class TriangleDessinable extends ObjetGeometriqueDessinable
{

	Coord2D[] angles = {};
	
	public TriangleDessinable()
	{
	}

	public TriangleDessinable(IDessinateurObjetGeometrique dessinateur,
							  String nom, Coord2D[] angles)
	{
		super(dessinateur);
		this.setNom(nom);
		this.angles = angles;
	}

	@Override
	public void Dessiner()
	{
		dessinateur.dessinerTriangle(angles);
	}

}
