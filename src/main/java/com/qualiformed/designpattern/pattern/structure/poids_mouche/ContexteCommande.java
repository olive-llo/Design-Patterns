package com.qualiformed.designpattern.pattern.structure.poids_mouche;

public class ContexteCommande
{
	private int table;
	public ContexteCommande()
	{
		table = -1;
	}
	
	public ContexteCommande(int table)
	{
		this();
		this.table = table;
	}

	public int getTable()
	{
		return table;
	}

	public void setTable(int table)
	{
		this.table = table;
	}
}
