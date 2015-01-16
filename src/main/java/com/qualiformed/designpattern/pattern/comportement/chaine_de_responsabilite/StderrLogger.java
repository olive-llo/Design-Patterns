package com.qualiformed.designpattern.pattern.comportement.chaine_de_responsabilite;

public class StderrLogger extends Logger
{
	public StderrLogger(int mask)
	{
		this.mask = mask;
	}

	protected void writeMessage(String msg)
	{
		System.err.println("Envoi vers stderr: " + msg);
	}
}