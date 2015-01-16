package com.qualiformed.designpattern.tests;

import com.qualiformed.designpattern.pattern.comportement.observateur.Observateur;
import com.qualiformed.designpattern.pattern.comportement.observateur.Observe;

public class Test_PatternDeComportement_Observateur
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Observe intervenant = new Observe("intervenant");
		Observateur auditeur1 = new Observateur("auditeur1");
		Observateur auditeur2 = new Observateur("auditeur2");
		Observateur auditeur3 = new Observateur("auditeur3");
		intervenant.ajouterObstervateur(auditeur1);
		intervenant.ajouterObstervateur(auditeur2);
		intervenant.ajouterObstervateur(auditeur3);
		
		intervenant.Dit("Bonjour");
		intervenant.Dit("Je suis votre intervenant");
	}
}
