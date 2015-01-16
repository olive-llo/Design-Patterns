package com.qualiformed.designpattern.pattern.comportement.visiteur;

public class VisiteurListeElementVoiture implements IVisiteurElementDeVoiture
{
	final String entete = "Aperçu de l'élément ";
	
	@Override
	public void visit(IElementDeVoiture objet)
	{
		System.out.println(entete + objet.getClass().getSimpleName() + " : " + objet.getNom());
	}
}
