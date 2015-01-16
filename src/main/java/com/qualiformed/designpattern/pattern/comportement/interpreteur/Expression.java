package com.qualiformed.designpattern.pattern.comportement.interpreteur;

import java.util.Stack;

public interface Expression
{
	public void interpreter(Stack<Integer> s);
}
