package com.qualiformed.designpattern.tests;

import com.qualiformed.designpattern.pattern.structure.objet_composite.INoeud;
import com.qualiformed.designpattern.pattern.structure.objet_composite.Noeud;
import com.qualiformed.designpattern.pattern.structure.objet_composite.NoeudValeur;
import java.util.Arrays;

public class Test_PatternStructure_Composite
{
	private static final int indentSize = 3;

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
//		representationTreeViewSimple.append("v Toutes\n");
//		representationTreeViewSimple.append(" > Carte Mére\n");
//		representationTreeViewSimple.append(" v Stockage\n"); 
//		representationTreeViewSimple.append("  > Amovible\n");
//		representationTreeViewSimple.append("  > Interne\n");
//		representationTreeViewSimple.append("  v Cloud\n"); 
//		representationTreeViewSimple.append("   > Nuage1\n");
//		representationTreeViewSimple.append("   > Nuage2\n");
//		representationTreeViewSimple.append(" > Boétier\n");
//		representationTreeViewSimple.append(" > Périphérique\n");

		Noeud tmp = null;

		Noeud racine = new Noeud(null);
		racine.setValeur(new NoeudValeur("Toutes"));
		racine.setAttribut("open", "true");
		
		Noeud carteMere = new Noeud(racine);
		carteMere.setValeur(new NoeudValeur("Carte Mére"));
		carteMere.setAttribut("open", "false");

		Noeud stockage = new Noeud(racine);
		stockage.setValeur(new NoeudValeur("Stockage"));
		stockage.setAttribut("open", "true");

		tmp = new Noeud(stockage);
		tmp.setValeur(new NoeudValeur("Amovible"));
		tmp.setAttribut("open", "false");
		
		tmp = new Noeud(stockage);
		tmp.setValeur(new NoeudValeur("Interne"));
		tmp.setAttribut("open", "false");

		Noeud cloud = new Noeud(stockage);
		cloud.setValeur(new NoeudValeur("Cloud"));
		cloud.setAttribut("open", "true");
		
		tmp = new Noeud(cloud);
		tmp.setValeur(new NoeudValeur("Nuage1"));
		tmp.setAttribut("open", "false");

		tmp = new Noeud(cloud);
		tmp.setValeur(new NoeudValeur("Nuage2"));
		tmp.setAttribut("open", "false");

		tmp = new Noeud(racine);
		tmp.setValeur(new NoeudValeur("Boétier"));
		tmp.setAttribut("open", "false");

		tmp = new Noeud(racine);
		tmp.setValeur(new NoeudValeur("Périphérique"));
		tmp.setAttribut("open", "false");
		
		showAsXml(racine);
	}
	
	private static void showAsXml(INoeud noeud)
	{
		if (noeud != null)
		{
			String name = "Niveau_" + noeud.getLevel() + "_" + noeud.getIndice();
			String indent = getIndent(noeud.getLevel());
			System.out.print(indent + "<noeud nom=\""+name+"\" ");
			boolean isEmpty = ((noeud.getValeur() == null) && (noeud.getEnfants().size()==0)); 
			int i = 0;
			String key = noeud.getAttributKey(i);
			for ( ; key != null; i++)
			{
				key = noeud.getAttributKey(i);
				if (key != null)
				System.out.print(" " + key + "=\"" + noeud.getAttribut(key).getValue()+"\"");
			}
			if (isEmpty)
				System.out.println("/>");
			else
			{
				System.out.println(">");
				if (null != noeud.getValeur())
					System.out.println(getIndent(noeud.getLevel() + 1) + noeud.getValeur().toString());
				for (INoeud enfant : noeud.getEnfants())
				{
					showAsXml(enfant);
				}
				System.out.println(indent + "</noeud>");
			}
		}
	}

	private static String getIndent(int niveau)
	{
		char[] spaces = new char[niveau * indentSize];
		Arrays.fill(spaces, ' ');
		return new String(spaces);
	}
	
}
