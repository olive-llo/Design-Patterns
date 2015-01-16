package com.qualiformed.designpattern.tests;

import com.qualiformed.designpattern.pattern.comportement.interpreteur.Interpreteur;

public class Test_PatternDeComportement_Interpreteur
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
        String expression = "42 4 2 - +";
        Interpreteur p = new Interpreteur(expression);
        System.out.println("'" + expression +"' égal " + p.evaluer());
	}

}
