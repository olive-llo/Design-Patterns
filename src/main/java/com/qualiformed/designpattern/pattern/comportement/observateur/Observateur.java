package com.qualiformed.designpattern.pattern.comportement.observateur;

public class Observateur implements IOBservateur<String>
{
	String nom;
	
	public Observateur(String nom)
	{
		this.nom = nom;
	}

	public String getNom()
	{
		return nom;
	}

	public void setNom(String nom)
	{
		this.nom = nom;
	}

	@Override
	public void Notifier(IObservable<String> source, String valeur)
	{
		System.out.println(nom + " : " + source.getNom() + " a dit \"" + valeur + "\"");
	}
}
