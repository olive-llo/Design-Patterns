package objets_de_base;

public abstract class ObjetGeometriqueAbstrait implements IObjetGeometrique
{
	private String nom;
	
	public ObjetGeometriqueAbstrait()
	{
	}

	public ObjetGeometriqueAbstrait(String nom)
	{
		this.nom = nom;
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
