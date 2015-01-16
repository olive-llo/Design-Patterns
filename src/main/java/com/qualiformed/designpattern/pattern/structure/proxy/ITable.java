package com.qualiformed.designpattern.pattern.structure.proxy;

import java.util.HashMap;

public interface ITable
{
	public HashMap<String, Class<? extends IColonneValue>> getColonnes();
	public void addColonne(String nom, Class<? extends IColonneValue> classe);
	public boolean colonneAccepte(String nom, IColonneValue valeur);
	public ILigneTable insert();
	public ILigneTable get(int indice);
	public void delete(ILigneTable ligne);
}
