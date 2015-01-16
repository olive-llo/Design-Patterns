package com.qualiformed.designpattern.pattern.structure.pont;

import objets_de_base.Coord3D;

public class TetraedreDessinable extends ObjetGeometriqueDessinable
{
	Coord3D[] angles;
	
	public TetraedreDessinable()
	{
	}

	public TetraedreDessinable(IDessinateurObjetGeometrique dessinateur, 
							   String nom, Coord3D[] angles)
	{
		super(dessinateur);
		this.angles = angles;
		this.setNom(nom);
	}

	@Override
	public void Dessiner()
	{
		dessinateur.dessinerTetraedre(angles);
	}
}
