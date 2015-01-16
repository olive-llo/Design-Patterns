package com.qualiformed.designpattern.pattern.comportement.commande;

/*la classe réceptrice*/
public class Lampe
{

	public Lampe()
	{
	}

	public void allumer()
	{
		System.out.println("La lumiére est allumée");
	}

	public void eteindre()
	{
		System.out.println("La lumiére est éteinte");
	}
}
