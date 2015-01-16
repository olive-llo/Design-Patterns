package com.qualiformed.designpattern.tests;

import com.qualiformed.designpattern.pattern.creation.builder.BuilderImmeuble;
import com.qualiformed.designpattern.pattern.creation.builder.BuilderMaison;
import com.qualiformed.designpattern.pattern.creation.builder.BuilderMaisonIndividuelle;
import com.qualiformed.designpattern.pattern.creation.builder.Maison;
import com.qualiformed.designpattern.pattern.creation.builder.MaitreDOeuvre;

public class Test_PatternDeCreation_Builder
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		System.out.println("Création d'objets \"maison\" par une classe de type Builder");
		System.out.println("-> instanciation de l'objet directeur : \"maitreDOeuvre\"");
	    MaitreDOeuvre maitreDOeuvre = new MaitreDOeuvre();
		System.out.println("-> instanciation de l'objet monteur : \"monteurMaisonIndividuelle\"");
	    BuilderMaison monteurMaisonIndividuelle  = new BuilderMaisonIndividuelle();
		System.out.println("-> instanciation de l'objet monteur : \"monteurImmeuble\"");
	    BuilderMaison monteurImmeuble = new BuilderImmeuble();
	
		System.out.println("-> affectation de \"monteurMaisonIndividuelle\" au \"maitreDOeuvre\"");
	    maitreDOeuvre.setMonteurMaison(monteurMaisonIndividuelle);
		System.out.println("-> construction de la maison");
	    maitreDOeuvre.construireMaison();
	    Maison maison = maitreDOeuvre.getMaison();
	    System.out.println(maison.getDescription());
	
		System.out.println("-> affectation de \"monteurImmeuble\" au \"maitreDOeuvre\"");
	    maitreDOeuvre.setMonteurMaison(monteurImmeuble);
		System.out.println("-> construction de la maison");
	    maitreDOeuvre.construireMaison();
	    Maison immeuble = maitreDOeuvre.getMaison();
	    System.out.println(immeuble.getDescription());
	}
}
