package com.qualiformed.designpattern.tests;

import com.qualiformed.designpattern.pattern.structure.decorateur.AstonMartin;
import com.qualiformed.designpattern.pattern.structure.decorateur.IVoiture;
import com.qualiformed.designpattern.pattern.structure.decorateur.VoitureAmphibie;
import com.qualiformed.designpattern.pattern.structure.decorateur.VoitureAvecClimatisation;
import com.qualiformed.designpattern.pattern.structure.decorateur.VoitureAvecParachute;

public class Test_PatternStructure_Decorateur
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		IVoiture astonMartin = new VoitureAvecClimatisation(new AstonMartin()); // Climatisation de série
		astonMartin = new VoitureAvecParachute(astonMartin); // Ajout d'une option (décorateur)
		astonMartin = new VoitureAmphibie(astonMartin);
 
		System.out.println(String.format("Prix = %.2fé", astonMartin.getPrix())); 
	}

}
