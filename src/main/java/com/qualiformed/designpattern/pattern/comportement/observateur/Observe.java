package com.qualiformed.designpattern.pattern.comportement.observateur;

import java.util.ArrayList;

public class Observe implements IObservable<String>
{
	private ArrayList<IOBservateur<String>> observateurs = new ArrayList<IOBservateur<String>>();
	private String nom;
	
	public Observe(String nom)
	{
		this.nom = nom;
	}

	@Override
	public void ajouterObstervateur(IOBservateur<String> observateur)
	{
		observateurs.add(observateur);
	}

	@Override
	public void supprimerObstervateur(IOBservateur<String> observateur)
	{
		observateurs.remove(observateur);
	}
	
	public void Dit(String s)
	{
		for (IOBservateur<String> observateur : observateurs)
		{
			observateur.Notifier(this, s);
		}
	}

	@Override
	public String getNom()
	{
		return nom;
	}
}
