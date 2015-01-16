package com.qualiformed.designpattern.pattern.comportement.patron_de_methode;

public class Monopoly extends JeuDeSociete
{
	int coup = 1;
	@Override
	void initialiserLeJeu()
	{
		System.out.println("Monopoly : initialisation du jeu");
	}

	@Override
	void faireJouer(int joueur)
	{
		System.out.println("Monopoly : coup né"+coup+", le joueur " + joueur + " joue");
		coup++;
	}

	@Override
	boolean partieTerminee()
	{
		return coup > 50;
	}

	@Override
	void proclamerLeVainqueur()
	{
		System.out.println("Monopoly : le joueur 0 a gagné !!!");
	}

}
