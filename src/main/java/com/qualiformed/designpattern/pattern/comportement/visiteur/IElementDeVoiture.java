package com.qualiformed.designpattern.pattern.comportement.visiteur;

public interface IElementDeVoiture
{
	void accept(IVisiteurElementDeVoiture v);
	public String getNom();
}
