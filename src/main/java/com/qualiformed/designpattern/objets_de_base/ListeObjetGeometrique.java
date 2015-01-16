package objets_de_base;

import java.util.ArrayList;
import java.util.Collection;

public class ListeObjetGeometrique extends ArrayList<ObjetGeometriqueAbstrait>
{
	private static final long serialVersionUID = 1L;

	private String nom;
	
	public ListeObjetGeometrique()
	{
		super();
	}

	public ListeObjetGeometrique(String nom)
	{
		this();
		this.nom = nom;
	}
	
	public ListeObjetGeometrique(Collection<? extends ObjetGeometriqueAbstrait> arg0)
	{
		super(arg0);
	}

	public ListeObjetGeometrique(int arg0)
	{
		super(arg0);
	}

	public String getNom()
	{
		return nom;
	}

	public void setNom(String nom)
	{
		this.nom = nom;
	}
}
