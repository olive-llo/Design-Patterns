package com.qualiformed.designpattern.tests;

import com.qualiformed.designpattern.pattern.comportement.patron_de_methode.Echecs;
import com.qualiformed.designpattern.pattern.comportement.patron_de_methode.Monopoly;

public class Test_PatternDeComportement_patron_de_methode
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		System.out.println("---------------------------------------------------------------------------");
		Echecs echecs = new Echecs();
		echecs.jouerUnePartie(2);
		System.out.println("---------------------------------------------------------------------------");
		Monopoly monopoly = new Monopoly();
		monopoly.jouerUnePartie(5);
		System.out.println("---------------------------------------------------------------------------");
	}
}
