package com.qualiformed.designpattern.pattern.comportement.etat;

public class EtatB implements IEtat
{
	//Compteur d'états
	private int count = 0;

	@Override
	public void ecrireNom(final Contexte context, final String name)
	{
		System.out.println(name.toUpperCase());
		//Changer d'état aprés que deux appels aient été faits
		if (++count > 1)
		{
			context.setEtat(new EtatA());
		}
	}
}
