package com.qualiformed.designpattern.pattern.comportement.memento;

import java.util.ArrayList;

public class Gardien
{
	private ArrayList savedStates = new ArrayList();

	public void addMemento(Object m)
	{
		savedStates.add(m);
	}

	public Object getMemento(int index)
	{
		return savedStates.get(index);
	}
}
