package com.qualiformed.designpattern.pattern.comportement.etat;

public class EtatA implements IEtat
{
    @Override
    public void ecrireNom(final Contexte context, final String nom)
    {
        System.out.println(nom.toLowerCase());
        context.setEtat(new EtatB());
    }
}
