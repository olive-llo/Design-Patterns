package com.qualiformed.designpattern.pattern.creation.singleton;

/**
 * @author fr.wikipedia.org
 * @see http://fr.wikipedia.org/wiki/Singleton_(patron_de_conception)
 * 
 *      La classe est final, car un singleton n'est pas censé avoir d'héritier.
 *      En effet, en Java il n'y a pas de polymorphisme sur les méthodes static,
 *      il est donc préférable de verrouiller la classe.
 * 
 */
public final class Singleton
{

	// L'utilisation du mot clé volatile permet, en Java version 5 et supérieur,
	// d'éviter le cas oé "Singleton.instance" est non-nul,
	// mais pas encore "réellement" instancié.
	// De Java version 1.2 é 1.4, il est possible d'utiliser la classe ThreadLocal
	private static volatile Singleton instance = null;

	// D'autres attributs, classiques et non "static".
	private String nom;

	/**
	 * Constructeur de l'objet.
	 */
	private Singleton()
	{
		// La présence d'un constructeur privé supprime le constructeur public par défaut.
		// De plus, seul le singleton peut s'instancier lui méme.
		super();
	}

	/**
	 * Méthode permettant de renvoyer une instance de la classe Singleton
	 * 
	 * @return Retourne l'instance du singleton.
	 */
	public final static Singleton getInstance()
	{
		// Le "Double-Checked Singleton"/"Singleton doublement vérifié" permet
		// d'éviter un appel coéteux é synchronized, une fois que l'instanciation est faite.
		if (Singleton.instance == null)
		{
			// Le mot-clé synchronized sur ce bloc empéche toute instanciation
			// multiple méme par différents "threads".
			// Il est TRES important.
			synchronized (Singleton.class)
			{
				if (Singleton.instance == null)
				{
					Singleton.instance = new Singleton();
				}
			}
		}
		return Singleton.instance;
	}

	// D'autres méthodes classiques et non "static".
	public void setNom(String nom)
	{
		this.nom = nom;
	}

	public String direBonjour()
	{
		return "bonjour " + this.nom;
	}
}