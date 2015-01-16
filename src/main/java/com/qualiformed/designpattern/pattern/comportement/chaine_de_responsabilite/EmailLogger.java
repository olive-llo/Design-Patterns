package com.qualiformed.designpattern.pattern.comportement.chaine_de_responsabilite;

public class EmailLogger extends Logger
{
	public EmailLogger(int mask)
	{
		this.mask = mask;
	}

	protected void writeMessage(String msg)
	{
		System.out.println("Envoi via email: " + msg);
	}
}
