package com.qualiformed.designpattern.tests;

import com.qualiformed.designpattern.pattern.comportement.etat.Contexte;

public class Test_PatternDeComportement_Etat
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
        final Contexte sc = new Contexte();
        
        sc.ecrireNom("Lundi");
        sc.ecrireNom("Mardi");
        sc.ecrireNom("Mercredi");
        sc.ecrireNom("Jeudi");
        sc.ecrireNom("Vendredi");
        sc.ecrireNom("Samedi");
        sc.ecrireNom("Dimanche");	}

}
