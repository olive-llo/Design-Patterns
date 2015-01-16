package com.qualiformed.designpattern.pattern.structure.pont;

import objets_de_base.IObjetGeometrique;

public abstract class ObjetGeometriqueDessinable implements IObjetGeometrique
{
	private String nom = "";
	
	IDessinateurObjetGeometrique dessinateur = null;
	
	public ObjetGeometriqueDessinable()
	{
		this.dessinateur = null;
	}

	public ObjetGeometriqueDessinable(IDessinateurObjetGeometrique dessinateur)
	{
		this.dessinateur = dessinateur;
	}

	public String getNom()
	{
		return nom;
	}

	public void setNom(String nom)
	{
		this.nom = nom;
	}
	
	/**
	 * Méthode abstraite laissant la responsabilité aux classes concrétes 
	 * de savoir comment se dessiner. 
	 */
	public abstract void Dessiner();

}
