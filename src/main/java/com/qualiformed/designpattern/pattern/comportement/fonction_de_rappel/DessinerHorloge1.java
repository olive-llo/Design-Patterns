package com.qualiformed.designpattern.pattern.comportement.fonction_de_rappel;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Calendar;

public class DessinerHorloge1 implements ICallbackPaint
{
	private final int LARGEUR_SECONDES = 2;
	private final int LARGEUR_MINUTES = 4;
	private final int LARGEUR_HEURES = 4;
	
	@Override
	public void paint(Graphics gsp)
	{
		Calendar d  = Calendar.getInstance();



	    int[] tPolygonX = new int[4];

	    int[] tPolygonY = new int[4];

	    Color cFond = new Color(232,232,232);



	    double n,z,u,x0,y0,x1,y1,x2,y2,x3,y3;



	    int h = d.get(Calendar.HOUR);

	    int m = d.get(Calendar.MINUTE);

	    int s = d.get(Calendar.SECOND);



	    gsp.setPaintMode();



	    gsp.setColor(cFond);

	    gsp.fillOval(2,2,118,118);

	    gsp.setColor(Color.black);

	    gsp.drawOval(2,2,118,118);



	    gsp.drawString("12",55,16);

	    gsp.drawString("6",58,116);

	    gsp.drawString("3",108,66);

	    gsp.drawString("9",8,66);



	    //Aiguille des secondes

	    n = s*200/60;

	    z = n/100*Math.PI;

	    u = (n+50)/100*Math.PI;



	    x0 = Math.sin(z)*50;

	    y0 = -Math.cos(z)*50;



	    x1 = -Math.sin(z)*10;

	    y1 = Math.cos(z)*10;



	    x2 = Math.sin(u)*LARGEUR_SECONDES;

	    y2 = -Math.cos(u)*LARGEUR_SECONDES;



	    x3 = -Math.sin(u)*LARGEUR_SECONDES;

	    y3 = Math.cos(u)*LARGEUR_SECONDES;



	    tPolygonX[0] = (int)x1+60;

	    tPolygonX[1] = (int)x2+60;

	    tPolygonX[2] = (int)x0+60;

	    tPolygonX[3] = (int)x3+60;



	    tPolygonY[0] = (int)y1+60;

	    tPolygonY[1] = (int)y2+60;

	    tPolygonY[2] = (int)y0+60;

	    tPolygonY[3] = (int)y3+60;



	    gsp.setColor(Color.red);

	    gsp.fillPolygon(tPolygonX, tPolygonY, 4);

	    gsp.setColor(Color.black);

	    gsp.drawPolygon(tPolygonX, tPolygonY, 4);



	    //Aiguille des minutes

	    n = m*200/60;

	    z = n/100*Math.PI;

	    u = (n+50)/100*Math.PI;



	    x0 = Math.sin(z)*50;

	    y0 = -Math.cos(z)*50;



	    x1 = -Math.sin(z)*10;

	    y1 = Math.cos(z)*10;



	    x2 = Math.sin(u)*LARGEUR_MINUTES;

	    y2 = -Math.cos(u)*LARGEUR_MINUTES;



	    x3 = -Math.sin(u)*LARGEUR_MINUTES;

	    y3 = Math.cos(u)*LARGEUR_MINUTES;



	    tPolygonX[0] = (int)x1+60;

	    tPolygonX[1] = (int)x2+60;

	    tPolygonX[2] = (int)x0+60;

	    tPolygonX[3] = (int)x3+60;



	    tPolygonY[0] = (int)y1+60;

	    tPolygonY[1] = (int)y2+60;

	    tPolygonY[2] = (int)y0+60;

	    tPolygonY[3] = (int)y3+60;



	    gsp.setColor(Color.yellow);

	    gsp.fillPolygon(tPolygonX, tPolygonY, 4);

	    gsp.setColor(Color.black);

	    gsp.drawPolygon(tPolygonX, tPolygonY, 4);



	    //Aiguille des heures

	    n = h*200/12 + m*200/60/12;

	    z = n/100*Math.PI;

	    u = (n+50)/100*Math.PI;



	    x0 = Math.sin(z)*35;

	    y0 = -Math.cos(z)*35;



	    x1 = -Math.sin(z)*10;

	    y1 = Math.cos(z)*10;



	    x2 = Math.sin(u)*LARGEUR_HEURES;

	    y2 = -Math.cos(u)*LARGEUR_HEURES;



	    x3 = -Math.sin(u)*LARGEUR_HEURES;

	    y3 = Math.cos(u)*LARGEUR_HEURES;



	    tPolygonX[0] = (int)x1+60;

	    tPolygonX[1] = (int)x2+60;

	    tPolygonX[2] = (int)x0+60;

	    tPolygonX[3] = (int)x3+60;



	    tPolygonY[0] = (int)y1+60;

	    tPolygonY[1] = (int)y2+60;

	    tPolygonY[2] = (int)y0+60;

	    tPolygonY[3] = (int)y3+60;



	    gsp.setColor(Color.green);

	    gsp.fillPolygon(tPolygonX, tPolygonY, 4);

	    gsp.setColor(Color.black);

	    gsp.drawPolygon(tPolygonX, tPolygonY, 4);
	}
}
