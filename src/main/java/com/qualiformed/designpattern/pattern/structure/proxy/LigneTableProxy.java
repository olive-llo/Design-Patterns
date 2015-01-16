package com.qualiformed.designpattern.pattern.structure.proxy;

public class LigneTableProxy implements ILigneTable
{
	private static String bloquePar;
	String proprietaire;
	boolean modifiee = false;
	LigneTable ligneReelle = null;
	LigneTable ligneModifiee = null;
	
	public LigneTableProxy()
	{
	}

	public LigneTableProxy(LigneTable ligneTable, String proprietaire)
	{
		this.ligneReelle = ligneTable;
		this.proprietaire = proprietaire;
	}
	
	@Override
	public void setValue(String nomColonne, IColonneValue valeur) throws Exception
	{
		boolean bloquee = estBloquee();
		
		if (bloquee)
			throw(new Exception("Cette ligne est en cours de modification par " + bloquePar));
		else
		{
			if (bloquePar == null || ((bloquePar != null) && (bloquePar.isEmpty())))
				bloquePar = proprietaire;
			
			if (ligneModifiee == null)
				ligneModifiee = ligneReelle.clone();
			ligneModifiee.setValue(nomColonne, valeur);
			modifiee = true;
		}
	}

	@Override
	public IColonneValue getValue(String nomColonne) throws Exception
	{
		return ligneReelle.getValue(nomColonne);
	}

	@Override
	public void valider(boolean save) throws Exception
	{
		boolean bloquee = estBloquee();
		
		if (save)
		{
			if (bloquee)
				throw(new Exception("La ligne est bloquée en écriture par " + bloquePar));
			else
			{
				bloquePar = "";
				if (modifiee && (ligneModifiee != null))
				{
					ligneModifiee.CopyTo(ligneReelle);
					this.modifiee = false;
					this.ligneModifiee = null;
				}
			}
		}
		else
		{
			this.modifiee = false;
			this.ligneModifiee = null;
			if (!bloquee)
				bloquePar = "";
		}
	}

	public boolean estBloquee()
	{
		boolean bloquee = bloquePar != null;
		if (bloquee)
			bloquee = (!bloquePar.isEmpty()) && (!bloquePar.equals(proprietaire));
		return bloquee;
	}
}
