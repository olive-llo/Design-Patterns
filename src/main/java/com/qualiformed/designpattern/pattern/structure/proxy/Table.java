package com.qualiformed.designpattern.pattern.structure.proxy;

import java.util.ArrayList;
import java.util.HashMap;

public class Table implements ITable
{
	HashMap<String, Class<? extends IColonneValue>> colonnes = new HashMap<String, Class<? extends IColonneValue>>();
	ArrayList<LigneTable> lignes = new ArrayList<LigneTable>();
	
	@Override
	public void addColonne(String nom, Class<? extends IColonneValue> classe)
	{
		colonnes.put(nom, classe);
	}

	@Override
	public boolean colonneAccepte(String nom, IColonneValue valeur)
	{
		boolean result = colonnes.containsKey(nom); 
		if (result)
		{
			if (valeur != null)
				result = colonnes.get(nom).isInstance(valeur);
		}
		return result;
	}

	@Override
	public HashMap<String, Class<? extends IColonneValue>> getColonnes()
	{
		return colonnes;
	}

	@Override
	public ILigneTable insert()
	{
		ILigneTable result = new LigneTable(this);
		lignes.add((LigneTable) result);
		return result;
	}

	@Override
	public ILigneTable get(int indice)
	{
		ILigneTable result = null;
		if ((indice >= 0) &&(indice < lignes.size()))
			result = lignes.get(indice);
		return result;
	}

	@Override
	public void delete(ILigneTable ligne)
	{
		if (lignes.contains(ligne))
			lignes.remove(ligne);
	}

}
