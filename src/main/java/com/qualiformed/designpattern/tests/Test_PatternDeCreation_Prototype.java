package com.qualiformed.designpattern.tests;

import com.qualiformed.designpattern.pattern.creation.prototype.ConstructeurPrototype;
import com.qualiformed.designpattern.pattern.creation.prototype.Modele;
import com.qualiformed.designpattern.pattern.creation.prototype.ModeleBase;

public class Test_PatternDeCreation_Prototype
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		System.out.println("Création d'objets par une classe de type Prototype");
		ModeleBase[] grandeSerie = new ModeleBase[10];
		ModeleBase modele = new Modele();
		ConstructeurPrototype constructeur = new ConstructeurPrototype(modele);
		
		for (int i = 0; i<grandeSerie.length; i++)
		{
			grandeSerie[i] = constructeur.construire();
			((Modele)grandeSerie[i]).partieVariable = "Modele : partie variable = " + (i+1);
		}
		
		for (int i = 0; i<grandeSerie.length; i++)
			System.out.println(grandeSerie[i]);
	}
}
