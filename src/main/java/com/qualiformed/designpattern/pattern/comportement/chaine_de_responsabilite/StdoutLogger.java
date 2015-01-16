package com.qualiformed.designpattern.pattern.comportement.chaine_de_responsabilite;

public class StdoutLogger extends Logger
{
	public StdoutLogger(int mask)
	{
		this.mask = mask;
	}

	protected void writeMessage(String msg)
	{
		System.out.println("Ecriture vers stdout: " + msg);
	}
}