package com.qualiformed.designpattern.pattern.comportement.etat;

public interface IEtat
{
    /**
     * Méthode d'écriture du nom de l'état.
     * @param contexte the stateful context
     * @param name the name to be written
     */
    void ecrireNom(Contexte contexte, String name);
}
