package com.qualiformed.designpattern.pattern.comportement.etat;

public class Contexte
{
	private IEtat monEtat;

	/**
	 * Constructeur par défaut
	 */
	public Contexte()
	{
		setEtat(new EtatA());
	}

	/**
	 * 
	 * Met le contexte dans un nouvel état.
	 * Normalement appelé uniquemant par les classes implémentant l'inteface IEtat
	 * @param nouvelEtat l'état de ce contexte
	 */
	void setEtat(final IEtat nouvelEtat)
	{
		monEtat = nouvelEtat;
	}

	/**
	 * Méthode exprimant le contexte en fonction de l'état dans lequel il se trouve
	 * 
	 * @param name le nom é écrire
	 */
	public void ecrireNom(final String name)
	{
		monEtat.ecrireNom(this, name);
	}
}
