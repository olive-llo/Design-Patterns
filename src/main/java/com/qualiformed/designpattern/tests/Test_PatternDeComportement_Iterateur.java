package com.qualiformed.designpattern.tests;

import com.qualiformed.designpattern.pattern.comportement.iterateur.Iterateur;
import java.util.ArrayList;

public class Test_PatternDeComportement_Iterateur
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		ArrayList<String> livres = new ArrayList<String>();
		livres.add("Les design patterns - tome 1");
		livres.add("Les design patterns - tome 2");
		livres.add("Les design patterns - tome 3");
		livres.add("Les design patterns - tome 4");
		livres.add("Les design patterns - tome 5");
		
		Iterateur<String> iterateur = new Iterateur<String>(livres);
		
		while (iterateur.suivant())
		{
			System.out.println(iterateur.getCourant());
		}
	}
}
