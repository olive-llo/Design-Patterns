package com.qualiformed.designpattern.pattern.creation.builder;

import objets_de_base.ListeObjetGeometrique;
import objets_de_base.ObjetGeometriqueAbstrait;

public class Maison extends ObjetGeometriqueAbstrait
{
	protected ListeObjetGeometrique murs = new ListeObjetGeometrique("Murs");
	protected ListeObjetGeometrique toit = new ListeObjetGeometrique("Toit");
	protected ListeObjetGeometrique plancher = new ListeObjetGeometrique("Plancher");
	
	public String getDescription()
	{
		String result = "";
		result += "Plancher :\n";
		for (ObjetGeometriqueAbstrait objet : plancher)
			result += "\t" + objet.getNom() + "\n";

		result += "Murs :\n";
		for (ObjetGeometriqueAbstrait objet : murs)
			result += "\t" + objet.getNom() + "\n";

		result += "Toiture :\n";
		for (ObjetGeometriqueAbstrait objet : toit)
			result += "\t" + objet.getNom() + "\n";
		return result;
	}
}
