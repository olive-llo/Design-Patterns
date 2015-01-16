package com.qualiformed.designpattern.tests;

import com.qualiformed.designpattern.pattern.structure.facade.DateFacile;

public class Test_PatternStructure_Facade
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
        DateFacile d = new DateFacile("1980-08-20");   
        System.out.println("Date : "+d);   
        d.addDays(20);   
        System.out.println("20 jours aprés : "+d);
    }
}
