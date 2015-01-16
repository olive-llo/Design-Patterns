package com.qualiformed.designpattern.tests;

import com.qualiformed.designpattern.pattern.structure.pont.CercleDessinable;
import com.qualiformed.designpattern.pattern.structure.pont.DessinateurObjetGeometriqueV1;
import com.qualiformed.designpattern.pattern.structure.pont.DessinateurObjetGeometriqueV2;
import com.qualiformed.designpattern.pattern.structure.pont.IDessinateurObjetGeometrique;
import com.qualiformed.designpattern.pattern.structure.pont.ObjetGeometriqueDessinable;
import com.qualiformed.designpattern.pattern.structure.pont.ParallelepipedeDessinable;
import com.qualiformed.designpattern.pattern.structure.pont.RectangleDessinable;
import com.qualiformed.designpattern.pattern.structure.pont.SphereDessinable;
import com.qualiformed.designpattern.pattern.structure.pont.TetraedreDessinable;
import com.qualiformed.designpattern.pattern.structure.pont.TriangleDessinable;
import objets_de_base.Coord2D;
import objets_de_base.Coord3D;

public class Test_PatternStructure_pont
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		IDessinateurObjetGeometrique dessinateurV1 = new DessinateurObjetGeometriqueV1();
		IDessinateurObjetGeometrique dessinateurV2 = new DessinateurObjetGeometriqueV2();

		ObjetGeometriqueDessinable[] objets =
		{
				new RectangleDessinable(dessinateurV1, "RectangleV1" , new Coord2D(10, 10), 100, 50),
				new TriangleDessinable(dessinateurV1, "TriangleV1", new Coord2D[]{new Coord2D(20, 10), new Coord2D(30, 30), new Coord2D(40, 10)}),
				new CercleDessinable(dessinateurV1, "CercleV1", new Coord2D(30, 20), 10),
				new ParallelepipedeDessinable(dessinateurV1, "ParallelepipedeV1" , new Coord3D(10, 10, 0), 100, 50, 40),
				new TetraedreDessinable(dessinateurV1, "TetraedreV1", new Coord3D[]{new Coord3D(40, 10, 0), new Coord3D(30, 30, 30), new Coord3D(40, 10, 20), new Coord3D(25, 20, 100)}),
				new SphereDessinable(dessinateurV1, "SphereV1", new Coord3D(30, 20, 50), 10),
				new RectangleDessinable(dessinateurV2, "RectangleV2" , new Coord2D(10, 10), 100, 50),
				new TriangleDessinable(dessinateurV2, "TriangleV2", new Coord2D[]{new Coord2D(20, 10), new Coord2D(30, 30), new Coord2D(40, 10)}),
				new CercleDessinable(dessinateurV2, "CercleV2", new Coord2D(30, 20), 10),
				new ParallelepipedeDessinable(dessinateurV2, "ParallelepipedeV2" , new Coord3D(10, 10, 0), 100, 50, 40),
				new TetraedreDessinable(dessinateurV2, "TetraedreV2", new Coord3D[]{new Coord3D(40, 10, 0), new Coord3D(30, 30, 30), new Coord3D(40, 10, 20), new Coord3D(25, 20, 100)}),
				new SphereDessinable(dessinateurV2, "SphereV2", new Coord3D(30, 20, 50), 10)
		};
		
		for (ObjetGeometriqueDessinable objet : objets)
		{
			System.out.print("Objet " + objet.getNom() + " se dessine ");
			objet.Dessiner();
			System.out.println("-------------------------------------------------");
		}
	}

}
