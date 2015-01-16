package com.qualiformed.designpattern.pattern.creation.builder;

import objets_de_base.Rectangle;
import objets_de_base.Triangle;

public class BuilderMaisonIndividuelle extends BuilderMaison
{
	@Override
	public void MonterPlancher()
	{
		maison.plancher.add(new Rectangle("Sous-sol"));
		maison.plancher.add(new Rectangle("Rez-de-chausse"));
	}

	@Override
	public void MonterMurs()
	{
		maison.murs.add(new Rectangle("Faéade sud-ouest"));
		maison.murs.add(new Rectangle("Faéade nord-est"));
		maison.murs.add(new Rectangle("Pignon sud-est partie basse"));
		maison.murs.add(new Triangle("Pignon sud-est partie haute"));
		maison.murs.add(new Rectangle("Pignon nord-ouest partie basse"));
		maison.murs.add(new Triangle("Pignon nord-ouest partie haute"));
		maison.murs.add(new Rectangle("Faéade sud-ouest"));
	}

	@Override
	public void MonterToiture()
	{
		maison.murs.add(new Rectangle("Pente de toit sud-ouest"));
		maison.murs.add(new Rectangle("Pente de toit nord-est"));
	}

}
