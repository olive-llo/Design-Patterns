package com.qualiformed.designpattern.pattern.structure.decorateur;

public abstract class Option implements IVoiture
{
	protected IVoiture _originale;
	protected double _tarifOption;

	public Option(IVoiture originale, double tarif)
	{
		_originale = originale;
		_tarifOption += tarif;
	}

	@Override
	public double getPrix()
	{
		return _originale.getPrix() + _tarifOption;
	}
}
