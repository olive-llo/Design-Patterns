package com.qualiformed.designpattern.pattern.structure.proxy;

public interface ILigneTable extends Cloneable
{
	public void setValue(String nomColonne, IColonneValue valeur) throws Exception;
	public IColonneValue getValue(String nomColonne) throws Exception;
	public void valider(boolean save) throws Exception;
}
