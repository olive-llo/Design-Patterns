package com.qualiformed.designpattern.pattern.creation.factory_method;

import objets_de_base.EnumBaseForme;
import objets_de_base.IObjetGeometrique;

public interface IFabriqueObjetGeometrique
{
	public IObjetGeometrique creerObjet(EnumBaseForme formeDeBase);
}
