package com.qualiformed.designpattern.tests;

import com.qualiformed.designpattern.pattern.creation.factory_method.FabriqueObjetGeometrique;
import objets_de_base.EnumBaseForme;
import objets_de_base.EnumDimension;
import objets_de_base.IObjetGeometrique;

public class Test_PatternDeCreation_Fabrique
{
	/**
	 * @param args
	 * Test la création d'objets géométriques par une Fabrique (factory method)
	 */
	public static void main(String[] args)
	{
		doTest();
	}

	private static void doTest()
	{
		IObjetGeometrique obj = null;
		
		System.out.println("Création d'objets géométriques");
		System.out.println("-> instanciation de la fabrique en contexte 2D");
		FabriqueObjetGeometrique fabrique = new FabriqueObjetGeometrique(EnumDimension.DIM_2D); 
		for (EnumBaseForme forme_de_base : EnumBaseForme.values())
		{
			obj = fabrique.creerObjet(forme_de_base);
			System.out.println("Un objet " + obj.getClass().getName() + " a été créé.");
		}

		System.out.println("-> instanciation de la fabrique en contexte 3D");
		fabrique = new FabriqueObjetGeometrique(EnumDimension.DIM_3D); 
		for (EnumBaseForme forme_de_base : EnumBaseForme.values())
		{
			obj = fabrique.creerObjet(forme_de_base);
			System.out.println("Un objet " + obj.getClass().getName() + " a été créé.");
		}
	}

}
