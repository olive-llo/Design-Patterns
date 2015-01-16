package com.qualiformed.designpattern.tests;

import com.qualiformed.designpattern.pattern.structure.poids_mouche.Cafe;
import com.qualiformed.designpattern.pattern.structure.poids_mouche.CommandeCafe;
import com.qualiformed.designpattern.pattern.structure.poids_mouche.ContexteCommande;
import java.util.ArrayList;

public class Test_PatternStructure_PoidsMouche
{
	static ArrayList<CommandeCafe> listeCommande = new ArrayList<CommandeCafe>();

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		passerComande("cappuccino", 2);
		passerComande("cappuccino", 2);
		passerComande("frappé", 1);
		passerComande("frappé", 1);
		passerComande("espresso", 1);
		passerComande("frappé", 897);
		passerComande("cappuccino", 97);
		passerComande("cappuccino", 97);
		passerComande("frappé", 3);
		passerComande("espresso", 3);
		passerComande("cappuccino", 3);
		passerComande("espresso", 96);
		passerComande("frappé", 552);
		passerComande("cappuccino", 121);
		passerComande("espresso", 121);

		for (CommandeCafe commande_passee : listeCommande)
		{
			System.out.println(commande_passee.getCafe().servirCafe(commande_passee.getContexte()));
		}
		System.out.println(" ");
		System.out.println("total des differentes sortes de cafés commandés : "
				+ Cafe.getDejaInstancie().size());
	}

	private static void passerComande(String nom_cafe, int table)
	{
		listeCommande.add(new CommandeCafe(Cafe.getCafe(nom_cafe),
				new ContexteCommande(table)));
	}
}
