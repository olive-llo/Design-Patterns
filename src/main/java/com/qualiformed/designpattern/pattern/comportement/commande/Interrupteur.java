package com.qualiformed.designpattern.pattern.comportement.commande;

/*la classe émetrice de la demande*/
import java.util.ArrayList;
import java.util.List;

public class Interrupteur
{

	private List<ICommande> historique = new ArrayList<ICommande>();

	public Interrupteur()
	{
	}

	public void memoriseEtExecute(ICommande cmd)
	{
		this.historique.add(cmd); // optionel
		cmd.executer();
	}
}