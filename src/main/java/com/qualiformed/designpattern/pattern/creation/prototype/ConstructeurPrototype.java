package com.qualiformed.designpattern.pattern.creation.prototype;

/**
 * La classe qui crée les ModeleBase selon le prototype donné
 * comme argument du constructeur
 */
public class ConstructeurPrototype
{
	private ModeleBase modele;
	
	public ConstructeurPrototype(ModeleBase modele)
	{
		this.modele = modele;
	}
	
	public ModeleBase construire()
	{
		return modele.clone();
	}
}
