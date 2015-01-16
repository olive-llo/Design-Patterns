package com.qualiformed.designpattern.pattern.structure.proxy;

import java.util.HashMap;

public class TableProxy implements ITable
{
	private Table tableReelle;
	private String proprietaire;
	
	public TableProxy(String proprietaire, Table tableReelle)
	{
		this.proprietaire = proprietaire;
		this.tableReelle = tableReelle;
	}
	
	@Override
	public HashMap<String, Class<? extends IColonneValue>> getColonnes()
	{
		HashMap<String, Class<? extends IColonneValue>> result = null;
		if (tableReelle != null)
			result = tableReelle.getColonnes();
		
		return result;
	}

	@Override
	public void addColonne(String nom, Class<? extends IColonneValue> classe)
	{
		if (tableReelle != null)
		{
			tableReelle.addColonne(nom, classe);
		}
	}

	@Override
	public boolean colonneAccepte(String nom, IColonneValue valeur)
	{
		boolean result = false;
		if (tableReelle != null)
			result = tableReelle.colonneAccepte(nom, valeur);

		return result;
	}

	/** 
	 * Ici on constate clairement que la ligne réelle de la table est encapsulée
	 * dans une ligne "proxy" qui la protége des accés extérieurs 
	 */
	@Override
	public ILigneTable insert()
	{
		ILigneTable result = null;
		if (tableReelle != null)
			result = new LigneTableProxy((LigneTable)tableReelle.insert(), proprietaire);
		return result;
	}

	@Override
	public ILigneTable get(int indice)
	{
		ILigneTable result = null;
		if (tableReelle != null)
			result = new LigneTableProxy((LigneTable)tableReelle.get(indice) , proprietaire);
		return result;
	}

	@Override
	public void delete(ILigneTable ligne)
	{
		if (ligne instanceof LigneTableProxy)
		{
			LigneTableProxy lig = (LigneTableProxy)ligne;
			if (proprietaire.equals(lig.proprietaire) && ! lig.estBloquee())
			{
				tableReelle.delete(lig.ligneReelle);
			}
		}
	}

}
