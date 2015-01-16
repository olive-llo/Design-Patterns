package com.qualiformed.designpattern.tests;

import com.qualiformed.designpattern.pattern.comportement.strategie.Ajouter;
import com.qualiformed.designpattern.pattern.comportement.strategie.Contexte;
import com.qualiformed.designpattern.pattern.comportement.strategie.Multiplier;
import com.qualiformed.designpattern.pattern.comportement.strategie.Soustraire;

public class Test_PatternDeComportement_Strategie
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
        Contexte context;
        
        // 3 contextes suivant des stratégies différentes
        context = new Contexte(new Ajouter());
        int resultA = context.executerStrategie(3,4);
 
        context = new Contexte(new Soustraire());
        int resultB = context.executerStrategie(3,4);
 
        context = new Contexte(new Multiplier());
        int resultC = context.executerStrategie(3,4);
 
        System.out.println("Resultat A : " + resultA );
        System.out.println("Resultat B : " + resultB );
        System.out.println("Resultat C : " + resultC );
    }
}
