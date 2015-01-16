package com.qualiformed.designpattern.tests;

import com.qualiformed.designpattern.pattern.structure.adaptateur.AdaptateurSimpleTreeViewToHTML;
import com.qualiformed.designpattern.pattern.structure.adaptateur.TreeViewSimple;
import objets_de_base.EmptyHtmlBuilder;

public class Test_PatternStructure_Adaptateur
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		//Initialisation d'une structure arborescente
		StringBuilder representationTreeViewSimple = new StringBuilder();
		representationTreeViewSimple.append("v Toutes\n");
		representationTreeViewSimple.append(" > Carte Mére\n");
		representationTreeViewSimple.append(" v Stockage\n"); 
		representationTreeViewSimple.append("  > Amovible\n");
		representationTreeViewSimple.append("  > Interne\n");
		representationTreeViewSimple.append("  v Cloud\n"); 
		representationTreeViewSimple.append("   > Nuage1\n");
		representationTreeViewSimple.append("   > Nuage2\n");
		representationTreeViewSimple.append(" > Boétier\n");
		representationTreeViewSimple.append(" > Périphérique\n");
		TreeViewSimple old_simple_tree_view = new TreeViewSimple(representationTreeViewSimple.toString());
		
		System.out.println("La structure arborescente é adapter :");
		System.out.println(old_simple_tree_view.getRepresentation());
		
		//Création de l'objet adaptateur
		System.out.println("Construction d'un objet adapatateur\n");
		AdaptateurSimpleTreeViewToHTML adaptateur = new AdaptateurSimpleTreeViewToHTML(old_simple_tree_view);
		String html_tree_view = adaptateur.getHTML();
		
		System.out.println("Utilisation de la représentation initiale du tree-view dans une page HTML é l'aide de l'adaptateur\n");
		System.out.println(EmptyHtmlBuilder.get("Test_PatternDeComportement_Adapteur").replace("{body}", html_tree_view));
	}

}
