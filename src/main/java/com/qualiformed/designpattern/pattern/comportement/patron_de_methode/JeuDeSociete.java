package com.qualiformed.designpattern.pattern.comportement.patron_de_methode;

public abstract class JeuDeSociete
{
	protected int nombreDeJoueurs;

	abstract void initialiserLeJeu();

	abstract void faireJouer(int joueur);

	abstract boolean partieTerminee();

	abstract void proclamerLeVainqueur();

	/* Une méthode socle : */
	public final void jouerUnePartie(int nombreDeJoueurs)
	{
		this.nombreDeJoueurs = nombreDeJoueurs;
		initialiserLeJeu();
		int j = 0;
		while (!partieTerminee())
		{
			faireJouer(j);
			j = (j + 1) % nombreDeJoueurs;
		}
		proclamerLeVainqueur();
	}
}
