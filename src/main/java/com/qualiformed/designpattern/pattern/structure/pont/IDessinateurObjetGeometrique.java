package com.qualiformed.designpattern.pattern.structure.pont;

import objets_de_base.Coord2D;
import objets_de_base.Coord3D;

public interface IDessinateurObjetGeometrique
{
	public void dessinerCercle(Coord2D centre, double rayon);
	public void dessinerRectangle(Coord2D origine, double largeur, double hauteur);
	public void dessinerTriangle(Coord2D[] angles);
	public void dessinerSphere(Coord3D centre, double rayon);
	public void dessinerParallelepipede(Coord3D origine, double largeur, double hauteur, double profondeur);
	public void dessinerTetraedre(Coord3D[] angles);
}
