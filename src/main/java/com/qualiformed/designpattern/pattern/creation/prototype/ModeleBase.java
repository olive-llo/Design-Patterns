package com.qualiformed.designpattern.pattern.creation.prototype;


/**
 * Classe mére des objets que l'on veut instancier par le mécanisme
 * du prototype 
 */
public class ModeleBase implements Cloneable
{
	@Override
	public ModeleBase clone()
	{
		ModeleBase result = null;
		try
		{
			result = (ModeleBase)super.clone();
		} catch (Exception e)
		{
		}
		return result;
	}
}
