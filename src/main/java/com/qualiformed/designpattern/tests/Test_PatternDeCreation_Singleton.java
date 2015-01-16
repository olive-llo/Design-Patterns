package com.qualiformed.designpattern.tests;

import com.qualiformed.designpattern.pattern.creation.singleton.Singleton;

public class Test_PatternDeCreation_Singleton
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		System.out.println("Utilisation du singleton");
		Singleton.getInstance().setNom("tout le monde");
		System.out.println(Singleton.getInstance().direBonjour());
	}

}
