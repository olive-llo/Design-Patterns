package com.qualiformed.designpattern.pattern.structure.decorateur;

public class VoitureAvecParachute extends Option
{

	public VoitureAvecParachute(IVoiture originale)
	{
		super(originale, 10.0);
	}

}
