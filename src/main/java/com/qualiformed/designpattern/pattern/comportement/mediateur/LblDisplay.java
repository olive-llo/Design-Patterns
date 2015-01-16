package com.qualiformed.designpattern.pattern.comportement.mediateur;

import java.awt.Font;
import javax.swing.JLabel;

public class LblDisplay extends JLabel
{

	IMediateur med;

	public LblDisplay(IMediateur m)
	{
		super("Commencer...");
		med = m;
		med.registerDisplay(this);
		setFont(new Font("Arial", Font.BOLD, 24));
	}

}