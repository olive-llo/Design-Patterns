package com.qualiformed.designpattern.tests;

import com.qualiformed.designpattern.pattern.structure.proxy.IColonneValue;
import com.qualiformed.designpattern.pattern.structure.proxy.ILigneTable;
import com.qualiformed.designpattern.pattern.structure.proxy.LigneTable;
import com.qualiformed.designpattern.pattern.structure.proxy.LigneTableProxy;
import com.qualiformed.designpattern.pattern.structure.proxy.Table;
import com.qualiformed.designpattern.pattern.structure.proxy.TableProxy;
import com.qualiformed.designpattern.pattern.structure.proxy.ValeurChaine;
import com.qualiformed.designpattern.pattern.structure.proxy.ValeurEntier;
import java.util.HashMap;

public class Test_PatternStructure_Proxy
{
	private static Table table = new Table();
	
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		initTableJeuDEssai();
		afficheTable(table);
		
		TableProxy tableUser1 = new TableProxy("user1", table);
		TableProxy tableUser2 = new TableProxy("user2", table);
		LigneTableProxy ligne = (LigneTableProxy) tableUser1.get(1);
		LigneTableProxy ligne2 = (LigneTableProxy) tableUser2.get(1);
		try
		{
			ligne.setValue("espece", new ValeurChaine().fromString("chat_noir"));
			//Test écriture par user2 sur une ligne modifiée par un user1
			ligne2.setValue("espece", new ValeurChaine().fromString("chat_blanc"));
		} catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		try
		{
			//Annulation de la modification par le user1
			ligne.valider(false);
		} catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		//Test écriture par user2 sur une ligne modifiée par un user1
		try
		{
			ligne2.setValue("espece", new ValeurChaine().fromString("chat_blanc"));
			ligne2.valider(true);
		} catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("---------------------------------------");
		afficheTable(table);
	}

	private static void initTableJeuDEssai()
	{
		table.addColonne("id", ValeurEntier.class);
		table.addColonne("espece", ValeurChaine.class);
		table.addColonne("nom", ValeurChaine.class);
		table.addColonne("age", ValeurEntier.class);
		table.addColonne("sexe", ValeurChaine.class);
		
		int id = 1000;
		try
		{
			LigneTable ligne = (LigneTable) table.insert();
			updateLigne(ligne, id++, "chat", "margotte", 5, "F");
			ligne = (LigneTable) table.insert();
			updateLigne(ligne, id++, "chat", "patchou", 7, "M");
			ligne = (LigneTable) table.insert();
			updateLigne(ligne, id++, "chien", "sam", 7, "M");
			ligne = (LigneTable) table.insert();
			updateLigne(ligne, id++, "perroquet", "coco", 2, "M");
			ligne = (LigneTable) table.insert();
			updateLigne(ligne, id++, "chevre", "suzette", 10, "F");
		} catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

	public static void updateLigne(LigneTable ligne, int id, String espece, String nom, int age, String sexe)
			throws Exception
	{
		ligne.setValue("id", new ValeurEntier().fromString((new Integer(id)).toString()));
		ligne.setValue("espece", new ValeurChaine().fromString(espece));
		ligne.setValue("nom", new ValeurChaine().fromString(nom));
		ligne.setValue("age", new ValeurEntier().fromString((new Integer(age)).toString()));
		ligne.setValue("sexe", new ValeurChaine().fromString(sexe));
	}

	private static void afficheTable(Table une_table)
	{
		HashMap<String, Class<? extends IColonneValue>> colonnes = une_table.getColonnes(); 
		int iLigne = 0;
		ILigneTable ligne;
		for (; null != (ligne = une_table.get(iLigne)); iLigne++)
		{
			for (String colonne : colonnes.keySet())
			{
				try
				{
					System.out.print(ligne.getValue(colonne).toString());
					System.out.print(",\t\t");
				} catch (Exception e)
				{
					System.out.println(e.getMessage());
				}
			}
			System.out.println();
		}
	}
}
