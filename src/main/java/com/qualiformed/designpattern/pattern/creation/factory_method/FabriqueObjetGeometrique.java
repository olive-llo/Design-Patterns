package com.qualiformed.designpattern.pattern.creation.factory_method;

import objets_de_base.Carre;
import objets_de_base.Cercle;
import objets_de_base.Cube;
import objets_de_base.EnumBaseForme;
import objets_de_base.EnumDimension;
import objets_de_base.IObjetGeometrique;
import objets_de_base.Sphere;
import objets_de_base.Tetraedre;
import objets_de_base.Triangle;

public class FabriqueObjetGeometrique implements IFabriqueObjetGeometrique
{
	EnumDimension contexte;
	public FabriqueObjetGeometrique()
	{
		contexte = EnumDimension.DIM_2D;
	}
	
	public FabriqueObjetGeometrique(EnumDimension contexte)
	{
		this.contexte = contexte;
	}
	
	/*
	 * La méthode creerObjet est une fabrique
	 **/
	public IObjetGeometrique creerObjet(EnumBaseForme formeDeBase)
	{
		IObjetGeometrique result = null;
		switch (contexte)
		{
			case DIM_2D :
			{
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
				break;
			}
			case DIM_3D :
			{
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
				break;
			}
		}
		return result;
	}
}
