package com.qualiformed.designpattern.tests;

import com.qualiformed.designpattern.pattern.comportement.memento.Createur;
import com.qualiformed.designpattern.pattern.comportement.memento.Gardien;

public class Test_PatternDeComportement_Memento
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
        Gardien gardien = new Gardien();
        
        Createur createur = new Createur();
        createur.set("Etat1");
        createur.set("Etat2");
        gardien.addMemento( createur.saveToMemento() );
        createur.set("Etat3");
        gardien.addMemento( createur.saveToMemento() );
        createur.set("Etat4");
 
        createur.restoreFromMemento( gardien.getMemento(1) );	}

}
