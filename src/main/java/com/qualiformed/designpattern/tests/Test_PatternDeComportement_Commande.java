package com.qualiformed.designpattern.tests;

import com.qualiformed.designpattern.pattern.comportement.commande.CommandeBasculerEnBas;
import com.qualiformed.designpattern.pattern.comportement.commande.CommandeBasculerEnHaut;
import com.qualiformed.designpattern.pattern.comportement.commande.ICommande;
import com.qualiformed.designpattern.pattern.comportement.commande.Interrupteur;
import com.qualiformed.designpattern.pattern.comportement.commande.Lampe;

public class Test_PatternDeComportement_Commande
{
	static Lampe lampe = null;
	static ICommande appuyerEnHaut = null;
	static ICommande appuyerEnBas = null;

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		lampe = new Lampe();
		appuyerEnHaut = new CommandeBasculerEnHaut(lampe);
		appuyerEnBas = new CommandeBasculerEnBas(lampe);

		Interrupteur interrupteur = new Interrupteur();

		AppuyerBouton("ON", interrupteur);
		AppuyerBouton("OFF", interrupteur);
	}

	public static void AppuyerBouton(String nom_commande, Interrupteur interrupteur)
	{
		try
		{
			if (nom_commande.equalsIgnoreCase("ON"))
			{
				interrupteur.memoriseEtExecute(appuyerEnHaut);
			}
			else if (nom_commande.equalsIgnoreCase("OFF"))
			{
				interrupteur.memoriseEtExecute(appuyerEnBas);
			}
			else
				System.out.println("La valeur \"ON\" ou \"OFF\" est nécessaire.");
		} catch (Exception e)
		{
			System.out.println("Aucune commande n'a pu étre activée.");
		}
	}

}
