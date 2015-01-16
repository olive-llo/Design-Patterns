package com.qualiformed.designpattern.pattern.comportement.interpreteur;

import java.util.Stack;

public class ExpressionTerminale_Plus implements Expression
{
	public void interpreter(Stack<Integer> s)
	{
		s.push(s.pop() + s.pop());
	}
}
