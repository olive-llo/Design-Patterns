package com.qualiformed.designpattern.pattern.comportement.commande;

/*une commande pour basculer l'état de la lampe né2 (commande concréte)*/
public class CommandeBasculerEnBas implements ICommande
{

	private Lampe lampe;

	public CommandeBasculerEnBas(Lampe lampe)
	{
		this.lampe = lampe;
	}

	public void executer()
	{
		lampe.eteindre();
	}
}
