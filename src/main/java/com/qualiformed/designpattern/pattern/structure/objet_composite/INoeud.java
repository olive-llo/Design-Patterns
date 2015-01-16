package com.qualiformed.designpattern.pattern.structure.objet_composite;

import java.util.ArrayList;

public interface INoeud
{
	public void addChild(INoeud enfant);
	public INoeud getChild(int indice);
	public INoeud getParent();
	public void setParent(INoeud parent);
	public int getLevel();
	public int getIndice();
	public ArrayList<INoeud> getEnfants();
	public INoeudValeur getValeur();
	public void setValeur(INoeudValeur valeur);
	
	public IAttribut setAttribut(String nom, String valeur);
	public void removeAttribut(int indice);
	public void removeAttribut(String nom);
	public IAttribut getAttribut(int indice);
	public IAttribut getAttribut(String nom);
	public String getAttributKey(int indice);
}
