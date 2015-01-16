package com.qualiformed.designpattern.pattern.structure.pont;

import objets_de_base.Coord3D;

public class ParallelepipedeDessinable extends ObjetGeometriqueDessinable
{
	Coord3D origine;
	double largeur;
	double hauteur;
	double profondeur;
	
	public ParallelepipedeDessinable()
	{
	}

	public ParallelepipedeDessinable(IDessinateurObjetGeometrique dessinateur,
			String nom,
			Coord3D origine, double largeur, double hauteur, double profondeur)
	{
		super(dessinateur);
		this.setNom(nom);
		this.origine = origine;
		this.largeur = largeur;
		this.hauteur = hauteur;
		this.profondeur = profondeur;
	}

	@Override
	public void Dessiner()
	{
		dessinateur.dessinerParallelepipede(origine, largeur, hauteur, profondeur);
	}

}
