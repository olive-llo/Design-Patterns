package com.qualiformed.designpattern.pattern.structure.adaptateur;

import java.util.ArrayList;
import java.util.Arrays;

public class AdaptateurSimpleTreeViewToHTML implements ITreeViewAdaptateur
{
	private final static int indentSize = 3;
	
	TreeViewSimple treeViewSimple;
	
	public AdaptateurSimpleTreeViewToHTML(TreeViewSimple treeViewSimple)
	{
		this.treeViewSimple = treeViewSimple;
	}

	private String getIndent(int niveau)
	{
		char[] spaces = new char[niveau * indentSize];
		Arrays.fill(spaces, ' ');
		return new String(spaces);
	}
	
	private void empiler(ArrayList<String> pile, String s)
	{
		pile.add(s);
	}
	
	private String depiler(ArrayList<String> pile)
	{
		String result = null;
		if (pile.size() > 0)
		{
			result = pile.get(pile.size()-1);
			pile.remove(pile.size()-1);
		}
		return result;
	}
	
	@Override
	public String getHTML()
	{
		StringBuilder result = new StringBuilder();
		
		ArrayList<String> pileNiveau = new ArrayList<String>(); 
		String[] lignes = treeViewSimple.getRepresentation().split("\n");
		
		int niveauPrecedent = -1;
		for (String ligne : lignes)
		{
			int niveau = 0;
			while ((niveau < ligne.length()) && (ligne.charAt(niveau)==' ')) niveau++;
			String val = ligne.trim();
			boolean open = val.startsWith("v");
			val = (open?"-":"+") + val.substring(1).trim();
			if (niveau > niveauPrecedent)
			{
				String indent = getIndent(niveau);
				result.append(indent + "<ul>\n");
				result.append(getIndent(niveau + 1) + "<li>"+val+"</li>\n");
				empiler(pileNiveau, indent+"</ul>\n");
			}
			else if (niveau < niveauPrecedent)
			{
				while (niveau < niveauPrecedent)
				{
					String s = depiler(pileNiveau);
					if (s != null)
					{
						result.append(s);
						result.append(getIndent(niveauPrecedent) + "<li>"+val+"</li>\n");
					}
					niveauPrecedent--;
				}
			}
			else
			{
				String indent = getIndent(niveau + 1);
				result.append(indent + "<li>"+val+"</li>\n");
			}
			niveauPrecedent = niveau;
		}
		
		String s = "";
		do
		{
			s = depiler(pileNiveau);
			if (s!=null)
				result.append(s);
		} while (s!=null);
		
		return result.toString();
	}

}
