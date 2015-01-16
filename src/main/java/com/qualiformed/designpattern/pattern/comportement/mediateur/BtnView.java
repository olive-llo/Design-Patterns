package com.qualiformed.designpattern.pattern.comportement.mediateur;

import java.awt.event.ActionListener;
import javax.swing.JButton;

//Un collegue concret
public class BtnView extends JButton implements ICommande
{

	IMediateur med;

	public BtnView(ActionListener al, IMediateur m)
	{
		super("Vue");
		addActionListener(al);
		med = m;
		med.registerView(this);
	}

	public void execute()
	{
		med.view();
	}

}