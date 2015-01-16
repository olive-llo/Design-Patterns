package com.qualiformed.designpattern.pattern.structure.objet_composite;

import java.util.ArrayList;
import java.util.HashMap;

public class Noeud implements INoeud
{
	INoeud parent;
	private INoeudValeur valeur;
	
	ArrayList<INoeud> enfants = new ArrayList<INoeud>();
	HashMap<String, IAttribut> attributs = new HashMap<String, IAttribut>();
	
	public Noeud()
	{
	}

	public Noeud(INoeud parent)
	{
		this.parent = parent;
		if (this.parent != null)
			parent.addChild(this);
	}

	@Override
	public void addChild(INoeud enfant)
	{
		enfants.add(enfant);
	}

	@Override
	public INoeud getChild(int indice)
	{
		INoeud result = null;
		if ((indice >= 0) && (indice < enfants.size()))
			result = enfants.get(indice);
		return result;
	}

	@Override
	public INoeud getParent()
	{
		return parent;
	}

	@Override
	public void setParent(INoeud parent)
	{
		this.parent = parent;
	}

	public INoeudValeur getValeur()
	{
		return valeur;
	}

	public void setValeur(INoeudValeur valeur)
	{
		this.valeur = valeur;
	}

	@Override
	public IAttribut setAttribut(String nom, String valeur)
	{
		IAttribut attr = attributs.get(nom);
		if (attr == null)
			attributs.put(nom, new Attribut(valeur));
		else
			attr.setValue(valeur);
		return attr;
	}

	@Override
	public void removeAttribut(int indice)
	{
		String key = getAttributKey(indice);
		if (key != null)
			attributs.remove(key);
	}

	@Override
	public void removeAttribut(String nom)
	{
		if (attributs.containsKey(nom))
			attributs.remove(nom);
	}

	@Override
	public IAttribut getAttribut(int indice)
	{
		IAttribut result = null;
		String key = getAttributKey(indice);
		if (key != null)
			result = attributs.get(key);
		return result;
	}

	@Override
	public String getAttributKey(int indice)
	{
		String result = null;
		if ((indice >=0) && (indice <attributs.entrySet().size()))
		{
			Object[] arrayKeys = attributs.keySet().toArray();
			result = (String)arrayKeys[indice];
		}
		
		return result;
	}

	@Override
	public int getLevel()
	{
		int result = 0;
		if (parent == null)
			result = 0;
		else
			result = 1 + parent.getLevel();
		return result;
	}

	@Override
	public int getIndice()
	{
		int result = 0;
		if (parent != null)
			result = parent.getEnfants().indexOf(this);
		return result;
	}

	@Override
	public ArrayList<INoeud> getEnfants()
	{
		return enfants;
	}

	@Override
	public IAttribut getAttribut(String nom)
	{
		IAttribut result = null;
		if (attributs.containsKey(nom))
			result = attributs.get(nom);
		return result;
	}
}
