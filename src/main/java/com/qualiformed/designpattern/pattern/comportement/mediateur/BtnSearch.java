package com.qualiformed.designpattern.pattern.comportement.mediateur;

import java.awt.event.ActionListener;
import javax.swing.JButton;

//Un collegue concret
public class BtnSearch extends JButton implements ICommande
{

	IMediateur med;

	public BtnSearch(ActionListener al, IMediateur m)
	{
		super("Recherche");
		addActionListener(al);
		med = m;
		med.registerSearch(this);
	}

	public void execute()
	{
		med.search();
	}

}