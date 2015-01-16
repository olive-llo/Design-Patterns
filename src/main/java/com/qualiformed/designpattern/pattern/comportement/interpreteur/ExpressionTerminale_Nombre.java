package com.qualiformed.designpattern.pattern.comportement.interpreteur;

import java.util.Stack;

public class ExpressionTerminale_Nombre implements Expression
{
	private int nombre;

	public ExpressionTerminale_Nombre(int number)
	{
		this.nombre = number;
	}

	public void interpreter(Stack<Integer> s)
	{
		s.push(nombre);
	}
}