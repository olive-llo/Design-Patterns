package objets_de_base;

public class Rectangle extends ObjetGeometriqueAbstrait implements IForme2D, IBaseRectangulaire
{
	public Rectangle()
	{
	}
	
	public Rectangle(String nom)
	{
		super(nom);
	}
}
