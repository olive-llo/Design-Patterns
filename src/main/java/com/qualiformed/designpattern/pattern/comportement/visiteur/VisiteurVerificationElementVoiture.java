package com.qualiformed.designpattern.pattern.comportement.visiteur;

public class VisiteurVerificationElementVoiture implements
		IVisiteurElementDeVoiture
{
	final String entete = "Vérification de l'élément ";

	@Override
	public void visit(IElementDeVoiture objet)
	{
		System.out.println(entete + objet.getClass().getSimpleName() + " : " + objet.getNom());
	}
}
