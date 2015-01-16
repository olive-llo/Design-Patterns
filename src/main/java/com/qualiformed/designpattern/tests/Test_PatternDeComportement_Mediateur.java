package com.qualiformed.designpattern.tests;

import com.qualiformed.designpattern.pattern.comportement.mediateur.BtnBook;
import com.qualiformed.designpattern.pattern.comportement.mediateur.BtnSearch;
import com.qualiformed.designpattern.pattern.comportement.mediateur.BtnView;
import com.qualiformed.designpattern.pattern.comportement.mediateur.ICommande;
import com.qualiformed.designpattern.pattern.comportement.mediateur.IMediateur;
import com.qualiformed.designpattern.pattern.comportement.mediateur.LblDisplay;
import com.qualiformed.designpattern.pattern.comportement.mediateur.Mediateur;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test_PatternDeComportement_Mediateur extends JFrame implements
		ActionListener
{
	//Le mediateur est le seul a savoir coordonner les interactions entre
	//les éléments de la fenétre
	IMediateur med = new Mediateur();

	Test_PatternDeComportement_Mediateur()
	{
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		JPanel p = new JPanel();
		p.add(new BtnView(this, med));  //Abonnement du bouton au médiateur
		p.add(new BtnBook(this, med));  //Abonnement du bouton au médiateur
		p.add(new BtnSearch(this, med));//Abonnement du bouton au médiateur
		//Abonnement du label au médiateur
		getContentPane().add(new LblDisplay(med), "North");
		getContentPane().add(p, "South");
		setSize(400, 200);
		centrerFenetre();
		setVisible(true);
	}

	/**
	 * Un bouton est enfoncé
	 */
	public void actionPerformed(ActionEvent ae)
	{
		ICommande comd = (ICommande) ae.getSource();
		comd.execute();
	}

	/**
	 * Placement de la fenétre au milieu de l'écran
	 */
	private void centrerFenetre()
	{
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(((screenSize.width / 2) - (this.getSize().width / 2)) , ((screenSize.height /2) - (this.getSize().height / 2)));
	}

	public static void main(String[] args)
	{
		new Test_PatternDeComportement_Mediateur();
	}
}
