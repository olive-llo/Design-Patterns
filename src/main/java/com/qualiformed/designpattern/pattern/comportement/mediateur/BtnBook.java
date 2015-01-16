package com.qualiformed.designpattern.pattern.comportement.mediateur;

import java.awt.event.ActionListener;
import javax.swing.JButton;

//Un collegue concret
public class BtnBook extends JButton implements ICommande
{

	IMediateur med;

	public BtnBook(ActionListener al, IMediateur m)
	{
		super("Livre");
		addActionListener(al);
		med = m;
		med.registerBook(this);
	}

	public void execute()
	{
		med.book();
	}

}