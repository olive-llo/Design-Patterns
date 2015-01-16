package com.qualiformed.designpattern.pattern.comportement.iterateur;

import java.util.ArrayList;

public class Iterateur<E>
{
	ArrayList<E> liste;
	int courant = -1;
	public Iterateur(ArrayList<E> liste)
	{
		this.liste = liste;
	}
	
	public E getCourant()
	{
		E result = null;
		if ((courant>= 0) && (courant<liste.size()))
			result = liste.get(courant);
		return result;
	}

	public boolean suivant()
	{
		boolean result = false;
		if ((liste.size()>0))
		{
			if (courant < 0)
			{
				courant = 0;
				result = true;
			}
			else if (courant<liste.size()-1)
			{
				courant++;
				result = true;
			}
		}
		return result;
	}

	public boolean precedent()
	{
		boolean result = false;
		if ((liste.size()>0))
		{
			if (courant >= liste.size())
			{
				courant = 0;
				result = true;
			}
			else if (courant > 0)
			{
				courant--;
				result = true;
			}
		}
		return result;
	}
}
