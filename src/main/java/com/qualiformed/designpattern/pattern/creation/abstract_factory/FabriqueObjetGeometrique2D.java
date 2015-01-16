package com.qualiformed.designpattern.pattern.creation.abstract_factory;

import objets_de_base.Carre;
import objets_de_base.Cercle;
import objets_de_base.EnumBaseForme;
import objets_de_base.IObjetGeometrique;
import objets_de_base.Triangle;

public class FabriqueObjetGeometrique2D extends FabriqueAbstraiteObjetGeometrique
{
	@Override
	public IObjetGeometrique creerObjet(EnumBaseForme formeDeBase)
	{
		IObjetGeometrique result = null;
		switch (formeDeBase)
		{
			case BASE_CARREE :
			{
				result = new Carre();
				break;
			}
			case BASE_TRIANGULAIRE :
			{
				result = new Triangle();
				break;
			}
			case BASE_CIRCULAIRE :
			{
				result = new Cercle();
				break;
			}
		}
		return result;
	}

}
