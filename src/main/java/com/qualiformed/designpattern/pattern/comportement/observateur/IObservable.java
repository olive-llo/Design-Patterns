package com.qualiformed.designpattern.pattern.comportement.observateur;

public interface IObservable<T>
{
	public void ajouterObstervateur(IOBservateur<T> observateur);
	public void supprimerObstervateur(IOBservateur<T> observateur);
	public String getNom();
}
