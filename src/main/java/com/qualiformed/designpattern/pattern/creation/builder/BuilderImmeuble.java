package com.qualiformed.designpattern.pattern.creation.builder;

import objets_de_base.Rectangle;

public class BuilderImmeuble extends BuilderMaison
{
	@Override
	public void MonterPlancher()
	{
		maison.plancher.add(new Rectangle("Sous-sol"));
		maison.plancher.add(new Rectangle("Rez-de-chausse"));
		maison.plancher.add(new Rectangle("1er étage"));
		maison.plancher.add(new Rectangle("2éme étage"));
		maison.plancher.add(new Rectangle("3éme étage"));
		maison.plancher.add(new Rectangle("4éme étage"));
		maison.plancher.add(new Rectangle("5éme étage"));
		maison.plancher.add(new Rectangle("6éme étage"));
		maison.plancher.add(new Rectangle("7éme étage"));
	}

	@Override
	public void MonterMurs()
	{
		maison.murs.add(new Rectangle("Faéade sud"));
		maison.murs.add(new Rectangle("Faéade ouest"));
		maison.murs.add(new Rectangle("Faéade nord"));
		maison.murs.add(new Rectangle("Faéade est"));
	}

	@Override
	public void MonterToiture()
	{
		maison.toit.add(new Rectangle("Terrasse"));
	}

}
