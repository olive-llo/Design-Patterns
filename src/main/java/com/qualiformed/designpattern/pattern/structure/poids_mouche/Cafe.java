package com.qualiformed.designpattern.pattern.structure.poids_mouche;

import java.util.HashMap;

public class Cafe implements ICafeServi
{
	private static HashMap<String, Cafe> dejaInstancie = new HashMap<String, Cafe>();
	
	private String nom;
	
	private Cafe()
	{
	}
	
	private Cafe(String nom)
	{
		this.nom = nom;
	}
	
	public static Cafe getCafe(String nom)
	{
		Cafe result = result = getDejaInstancie().get(nom);
		if (result == null)
		{
			result = new Cafe(nom);
			getDejaInstancie().put(nom, result);
		}
			
		return result;
	}

	public String getNom()
	{
		return nom;
	}

	@Override
	public String servirCafe(ContexteCommande contexte)
	{
		return "Un café " + this.getNom() + " est servi é la table né" + contexte.getTable();
	}

	public static HashMap<String, Cafe> getDejaInstancie()
	{
		return dejaInstancie;
	}
}
