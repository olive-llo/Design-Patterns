package com.qualiformed.designpattern.pattern.creation.abstract_factory;

import com.qualiformed.designpattern.pattern.creation.factory_method.IFabriqueObjetGeometrique;
import objets_de_base.EnumDimension;

public abstract class FabriqueAbstraiteObjetGeometrique implements IFabriqueObjetGeometrique
{

	public static IFabriqueObjetGeometrique getFactory(EnumDimension contexte)
	{
		IFabriqueObjetGeometrique result = null;
		switch (contexte)
		{
			case DIM_2D :
				result = new FabriqueObjetGeometrique2D();
				break;
			case DIM_3D :
				result = new FabriqueObjetGeometrique3D();
				break;
		}
		return result;
	}
	
	//La méthode creerObjet n'a pas é étre implémentée ici car la classe
	//FabriqueAbstraiteObjetGeometrique est abstraite.
	//Par contre, elle devra étre implémentée par les héritiers.
	//
	//public IObjetGeometrique creerObjet(EnumBaseForme formeDeBase)
}
