package com.qualiformed.designpattern.pattern.structure.pont;

import objets_de_base.Coord2D;
import objets_de_base.Coord3D;

public class DessinateurObjetGeometriqueV2 implements IDessinateurObjetGeometrique
{
	private static final String version = "Version 2.0";
	
	public DessinateurObjetGeometriqueV2()
	{
	}

	@Override
	public void dessinerCercle(Coord2D centre, double rayon)
	{
		System.out.println("en " + version);
		System.out.println("Dessin du cercle centre " + centre + " rayon " + rayon);
	}

	@Override
	public void dessinerRectangle(Coord2D origine, double largeur, double hauteur)
	{
		System.out.println("en " + version);
		System.out.println("Dessin du rectangle origine " + origine + " largeur " + largeur + " hauteur " + hauteur);
	}

	@Override
	public void dessinerTriangle(Coord2D[] angles)
	{
		System.out.println("en " + version);
		System.out.println("Dessin du triangle : ");
		int i = 1;
		for (Coord2D point : angles)
		{
			System.out.println("Angle[" + i + "] " + point);
			i++;
		}
	}

	@Override
	public void dessinerSphere(Coord3D centre, double rayon)
	{
		System.out.println("en " + version);
		System.out.println("Dessin du sphere centre " + centre + " rayon " + rayon);
	}

	@Override
	public void dessinerParallelepipede(Coord3D origine, double largeur,
			double hauteur, double profondeur)
	{
		System.out.println("en " + version);
		System.out.println("Dessin du parallelepipede origine " + origine + " largeur " + largeur + " hauteur " + hauteur + " profondeur " + profondeur);
	}

	@Override
	public void dessinerTetraedre(Coord3D[] angles)
	{
		System.out.println("en " + version);
		System.out.println("Dessin du tetraedre : ");
		int i = 1;
		for (Coord3D point : angles)
		{
			System.out.println("Angle[" + i + "] " + point);
			i++;
		}
	}

}
