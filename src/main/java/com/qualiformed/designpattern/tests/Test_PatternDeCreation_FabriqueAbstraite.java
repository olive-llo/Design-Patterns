package com.qualiformed.designpattern.tests;

import com.qualiformed.designpattern.pattern.creation.abstract_factory.FabriqueAbstraiteObjetGeometrique;
import com.qualiformed.designpattern.pattern.creation.factory_method.IFabriqueObjetGeometrique;
import objets_de_base.EnumBaseForme;
import objets_de_base.EnumDimension;
import objets_de_base.IObjetGeometrique;

public class Test_PatternDeCreation_FabriqueAbstraite
{

	/**
	 * @param args
	 * Test la création d'objets géométriques par une Fabrique Abstraite (abstract factory)
	 */
	public static void main(String[] args)
	{
		System.out.println("Création d'objets géométriques");
		IObjetGeometrique obj = null;
		
		//Obtention de la fabrique abstraite d'objets 2D
		System.out.println("-> instanciation de la fabrique abstraite d'objets 2D");
		IFabriqueObjetGeometrique fabriqueAbstraite = FabriqueAbstraiteObjetGeometrique.getFactory(EnumDimension.DIM_2D);

		for (EnumBaseForme forme_de_base : EnumBaseForme.values())
		{
			obj = fabriqueAbstraite.creerObjet(forme_de_base);
			System.out.println("Un objet " + obj.getClass().getName() + " a été créé.");
		}

		//Obtention de la fabrique abstraite d'objets 3D
		System.out.println("-> instanciation de la fabrique abstraite d'objets 3D");
		fabriqueAbstraite = FabriqueAbstraiteObjetGeometrique.getFactory(EnumDimension.DIM_3D);

		for (EnumBaseForme forme_de_base : EnumBaseForme.values())
		{
			obj = fabriqueAbstraite.creerObjet(forme_de_base);
			System.out.println("Un objet " + obj.getClass().getName() + " a été créé.");
		}
	}

}
