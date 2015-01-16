package com.qualiformed.designpattern.pattern.creation.abstract_factory;

import objets_de_base.Cube;
import objets_de_base.EnumBaseForme;
import objets_de_base.IObjetGeometrique;
import objets_de_base.Sphere;
import objets_de_base.Tetraedre;

public class FabriqueObjetGeometrique3D extends FabriqueAbstraiteObjetGeometrique
{

	@Override
	public IObjetGeometrique creerObjet(EnumBaseForme formeDeBase)
	{
		IObjetGeometrique result = null;
		switch (formeDeBase)
		{
			case BASE_CARREE :
			{
				result = new Cube();
				break;
			}
			case BASE_TRIANGULAIRE :
			{
				result = new Tetraedre();
				break;
			}
			case BASE_CIRCULAIRE :
			{
				result = new Sphere();
				break;
			}
		}
		return result;
	}

}
