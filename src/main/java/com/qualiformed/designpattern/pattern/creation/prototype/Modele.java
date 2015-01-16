package com.qualiformed.designpattern.pattern.creation.prototype;

/**
 * Classe concréte des objets que l'on veut instancier par
 * le mécanisme du prototype.
 *  
 */
public class Modele extends ModeleBase
{
	public String partieInvariante = "Modele : partie invariante";
	public String partieVariable;

	@Override
	public String toString()
	{
		return partieInvariante + "\n" + partieVariable;
	}
}
