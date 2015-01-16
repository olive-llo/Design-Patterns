package com.qualiformed.designpattern.pattern.comportement.patron_de_methode;

public class Echecs extends JeuDeSociete
{
	int coup = 1;
	
	@Override
	void initialiserLeJeu()
	{
		System.out.println("Echecs : initialisation du jeu");
	}

	@Override
	void faireJouer(int joueur)
	{
		System.out.println("Echecs : coup né"+coup+", le joueur " + joueur + " joue");
		coup++;
	}

	@Override
	boolean partieTerminee()
	{
		return coup > 10;
	}

	@Override
	void proclamerLeVainqueur()
	{
		System.out.println("Echecs : le joueur 0 a gagné !!!");
	}

}
