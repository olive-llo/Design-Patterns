package com.qualiformed.designpattern.tests;

import com.qualiformed.designpattern.pattern.comportement.chaine_de_responsabilite.EmailLogger;
import com.qualiformed.designpattern.pattern.comportement.chaine_de_responsabilite.Logger;
import com.qualiformed.designpattern.pattern.comportement.chaine_de_responsabilite.StderrLogger;
import com.qualiformed.designpattern.pattern.comportement.chaine_de_responsabilite.StdoutLogger;

public class Test_PatternDeComportement_ChaineDeResponsabilite
{

	private static Logger creerChaineDeResponsabilite()
	{
		// Construction de la chaine de responsabilité

		Logger logger = new StdoutLogger(Logger.DEBUG);

		Logger logger1 = new EmailLogger(Logger.A_NOTER);
		logger.setNext(logger1);

		Logger logger2 = new StderrLogger(Logger.ERR);
		logger1.setNext(logger2);

		return logger;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Logger chain = creerChaineDeResponsabilite();

		System.out.println("----------------------------------------------");

		// Traité par StdoutLogger (level = 7)
		chain.message("On entre dans la fonction f.", Logger.DEBUG);
		System.out.println("----------------------------------------------");

		// Traité par StdoutLogger et EmailLogger (level = 5)
		chain.message("Etape 1 effectuée avec succès.", Logger.A_NOTER);
		System.out.println("----------------------------------------------");

		// Traité par les 3 loggers (level = 3)
		chain.message("Une erreur s'est produite.", Logger.ERR);
		System.out.println("----------------------------------------------");
	}
}
