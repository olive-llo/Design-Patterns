package com.qualiformed.designpattern.pattern.comportement.commande;

/*une commande pour basculer l'état de la lampe né1 (commande concréte)*/
public class CommandeBasculerEnHaut implements ICommande
{

	private Lampe lampe;

	public CommandeBasculerEnHaut(Lampe lampe)
	{
		this.lampe = lampe;
	}

	public void executer()
	{
		lampe.allumer();
	}
}