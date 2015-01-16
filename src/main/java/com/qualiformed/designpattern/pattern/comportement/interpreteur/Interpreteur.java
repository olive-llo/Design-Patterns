package com.qualiformed.designpattern.pattern.comportement.interpreteur;

import java.util.ArrayList;
import java.util.Stack;

public class Interpreteur
{
	private ArrayList<Expression> arbreDEvaluation = new ArrayList<Expression>(); // ici
 																			// seulement
																			// une expression
																			// non terminale

	public Interpreteur(String chaine)
	{
		for (String mot : chaine.split(" "))
		{
			if (mot.equals("+"))
				arbreDEvaluation.add(new ExpressionTerminale_Plus());
			else if (mot.equals("-"))
				arbreDEvaluation.add(new ExpressionTerminale_Moins());
			// ...
			else
				arbreDEvaluation.add(new ExpressionTerminale_Nombre(Integer.parseInt(mot)));
		}
	}

	public int evaluer()
	{
		Stack<Integer> context = new Stack<Integer>();
		for (Expression e : arbreDEvaluation)
			e.interpreter(context);
		return context.pop();
	}
}