package com.qualiformed.designpattern.tests;

import com.cloudgarden.layout.AnchorConstraint;
import com.cloudgarden.layout.AnchorLayout;
import com.qualiformed.designpattern.pattern.comportement.fonction_de_rappel.DessinerHorloge1;
import com.qualiformed.designpattern.pattern.comportement.fonction_de_rappel.DessinerHorloge2;
import com.qualiformed.designpattern.pattern.comportement.fonction_de_rappel.ICallbackPaint;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.HashMap;
import java.util.Map.Entry;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

/**
 * This code was edited or generated using CloudGarden's Jigloo SWT/Swing GUI
 * Builder, which is free for non-commercial use. If Jigloo is being used
 * commercially (ie, by a corporation, company or business for any purpose
 * whatever) then you should purchase a license for each developer using Jigloo.
 * Please visit www.cloudgarden.com for details. Use of Jigloo implies
 * acceptance of these licensing terms. A COMMERCIAL LICENSE HAS NOT BEEN
 * PURCHASED FOR THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED LEGALLY FOR
 * ANY CORPORATE OR COMMERCIAL PURPOSE.
 */
public class Test_PatternDeComportement_fonction_de_rappel extends
		javax.swing.JFrame implements Runnable
{
	Thread tr;

	private JPanel panelGauche = null;
	private JPanel panelDroit = null;
	private Dimension dim = null;
	private JComboBox cbRepaintCallback;
	private Image imgTmp = null;
	private Graphics gTmp = null;
	private JSplitPane jSplitPane1;
	private boolean thread_running = false;

	private ICallbackPaint currentPaintCallBack = null;

	HashMap<String, ICallbackPaint> paintCB = new HashMap<String, ICallbackPaint>();

	/**
	 * Auto-generated main method to display this JFrame
	 */
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				Test_PatternDeComportement_fonction_de_rappel inst = new Test_PatternDeComportement_fonction_de_rappel();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}

	public boolean running()
	{
		return thread_running;
	}
	
	public Test_PatternDeComportement_fonction_de_rappel()
	{
		super();
		initGUI();
		if (tr == null)
		{
			tr = new Thread(this);
			thread_running = true;
			tr.start();
		}
	}

	private void initGUI()
	{
		try
		{
			addWindowListener(new WindowAdapter()
			{
				@Override
				public void windowClosing(WindowEvent e)
				{
					if (tr != null)
					{
						tr.interrupt();
						thread_running = false;
						try
						{
							tr.join();
						} catch (InterruptedException e1)
						{
							e1.printStackTrace();
						}
					}
					setVisible(false);
					dispose();
				}
				
			});
			
			AnchorLayout thisLayout = new AnchorLayout();
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
			{
				paintCB.put("DessinerHorloge1", new DessinerHorloge1());
				paintCB.put("DessinerHorloge2", new DessinerHorloge2());
				currentPaintCallBack = paintCB.get("DessinerHorloge1");

				panelGauche = new JPanel();
				AnchorLayout panelGaucheLayout = new AnchorLayout();
				panelGauche.setLayout(panelGaucheLayout);
				{
					ComboBoxModel cbRepaintCallbackModel = new DefaultComboBoxModel( new String[] {});
					cbRepaintCallback = new JComboBox();
					panelGauche.add(cbRepaintCallback, new AnchorConstraint(52,
							953, 139, 50, AnchorConstraint.ANCHOR_REL,
							AnchorConstraint.ANCHOR_REL,
							AnchorConstraint.ANCHOR_REL,
							AnchorConstraint.ANCHOR_REL));
					cbRepaintCallback.setModel(cbRepaintCallbackModel);
					cbRepaintCallback.setPreferredSize(new java.awt.Dimension(225, 21));
					for (Entry<String, ICallbackPaint> cb : paintCB.entrySet())
					{
						cbRepaintCallback.addItem(cb.getKey());
					}

					cbRepaintCallback.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent evt)
						{
							String s = (String) cbRepaintCallback
									.getSelectedItem();
							currentPaintCallBack = paintCB.get(s);
							repaint();
						}
					});
				}
				panelDroit = new JPanel();

				jSplitPane1 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
						panelGauche, panelDroit);
				getContentPane().add(
						jSplitPane1,
						new AnchorConstraint(46, 970, 956, 31,
								AnchorConstraint.ANCHOR_REL,
								AnchorConstraint.ANCHOR_REL,
								AnchorConstraint.ANCHOR_REL,
								AnchorConstraint.ANCHOR_REL));
				jSplitPane1.setPreferredSize(new java.awt.Dimension(368, 242));
				jSplitPane1.setDividerLocation(250);
				jSplitPane1
						.addPropertyChangeListener(new PropertyChangeListener()
						{
							public void propertyChange(PropertyChangeEvent evt)
							{
								onResize();
							}
						});

				jSplitPane1.addComponentListener(new ComponentAdapter()
				{
					public void componentResized(ComponentEvent evt)
					{
						onResize();
					}
				});

				// setBackground(Color.white);
			}

			pack();
			setSize(600, 300);
		} catch (Exception e)
		{
			// add your error handling code here
			e.printStackTrace();
		}
	}

	protected void onResize()
	{
		dim = panelDroit.getSize();
		if (dim != null)
		{
			if ((dim.width == 0) && (dim.height == 0))
				dim = null;
			else
			{
				int max = (dim.width < dim.height) ? dim.height : dim.width;
				imgTmp = createImage(max, max);
			}
		}
		if (imgTmp != null)
			gTmp = imgTmp.getGraphics();
	}

	@Override
	public void paint(Graphics graph)
	{
		super.paint(graph);
		if (currentPaintCallBack != null)
		{
			if (gTmp != null)
			{
				currentPaintCallBack.paint(gTmp);
				if (imgTmp != null)
				{
					Rectangle rect = panelDroit.getBounds();
					int div = jSplitPane1.getDividerSize() * 2;
					graph.drawImage(imgTmp, rect.x + div + 2, rect.y + 50,
							panelDroit);
				}
			}
		}
	}

	@Override
	public void run()
	{
		while (running())
		{
			repaint();
			try
			{
				Thread.sleep(1000);

			} catch (InterruptedException e)
			{
			}
		}
	}
}
