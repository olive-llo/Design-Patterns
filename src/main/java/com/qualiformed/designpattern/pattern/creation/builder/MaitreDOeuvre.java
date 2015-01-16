package com.qualiformed.designpattern.pattern.creation.builder;

public class MaitreDOeuvre
{
	private BuilderMaison monteur_maison;

	public void setMonteurMaison(BuilderMaison monteur_maison)
	{
		this.monteur_maison = monteur_maison;
	}

	public Maison getMaison()
	{
		return monteur_maison.getMaison();
	}

	public void construireMaison()
	{
		monteur_maison.creerNouvelleMaison();
		monteur_maison.MonterMurs();
		monteur_maison.MonterPlancher();
		monteur_maison.MonterToiture();
	}
}
