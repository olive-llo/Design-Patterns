package com.qualiformed.designpattern.pattern.comportement.observateur;

public interface IOBservateur<T>
{
	public void Notifier(IObservable<T> source, T valeur);
	public String getNom();
}
