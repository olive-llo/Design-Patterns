package com.qualiformed.designpattern.tests;

import com.qualiformed.designpattern.pattern.comportement.visiteur.IElementDeVoiture;
import com.qualiformed.designpattern.pattern.comportement.visiteur.VisiteurListeElementVoiture;
import com.qualiformed.designpattern.pattern.comportement.visiteur.VisiteurVerificationElementVoiture;
import com.qualiformed.designpattern.pattern.comportement.visiteur.Voiture;

public class Test_PatternDeComportement_Visiteur
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		IElementDeVoiture voiture = new Voiture("voiture");
		voiture.accept(new VisiteurListeElementVoiture());
		voiture.accept(new VisiteurVerificationElementVoiture());
	}
}
