package com.qualiformed.designpattern.pattern.structure.proxy;

import java.util.HashMap;
import java.util.Map.Entry;


public class LigneTable implements ILigneTable
{
	ITable parent;
	HashMap<String, IColonneValue> colonnes = new HashMap<String, IColonneValue>();   
	
	public LigneTable()
	{
	}
	
	public LigneTable(ITable parent)
	{
		this.parent = parent;
	}

	@Override
	public void setValue(String nomColonne, IColonneValue valeur) throws Exception
	{
		boolean ok = false;
		if (parent != null)
		{
			if (parent.colonneAccepte(nomColonne, valeur))
			{
				colonnes.put(nomColonne, valeur);
				ok = true;
			}
		}
		if (!ok)
			throw(new Exception("La colonne " + nomColonne + " n'existe pas ou ne peut accepter la valeur " + valeur.toString()));
	}

	@Override
	public IColonneValue getValue(String nomColonne) throws Exception
	{
		boolean ok = false;
		IColonneValue result = null;
		if (parent != null)
		{
			if (parent.getColonnes().containsKey(nomColonne))
			{
				result = colonnes.get(nomColonne);
				ok = true;
			}
		}

		if (!ok)
			throw(new Exception("La colonne " + nomColonne + " n'existe pas"));
		
		return result;
	}

	public ITable getParent()
	{
		return parent;
	}

	public void setParent(ITable parent)
	{
		this.parent = parent;
	}

	@Override
	public LigneTable clone() throws CloneNotSupportedException
	{
		LigneTable result = (LigneTable) super.clone();
		CopyTo(result);
		return result;
	}

	public void CopyTo(LigneTable result) throws CloneNotSupportedException
	{
		result.parent = parent;
		for (Entry<String, IColonneValue> colonne : colonnes.entrySet())
			result.colonnes.put(colonne.getKey(), colonne.getValue().clone());
	}

	@Override
	public void valider(boolean save) throws Exception
	{
	}
}
