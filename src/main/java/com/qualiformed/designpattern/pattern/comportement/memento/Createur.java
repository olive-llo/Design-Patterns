package com.qualiformed.designpattern.pattern.comportement.memento;

public class Createur
{
	private String state;

	public void set(String state)
	{
		System.out.println("Créateur : etat affecte a : " + state);
		this.state = state;
	}

	public Object saveToMemento()
	{
		System.out.println("Créateur : sauvegarde dans le memento.");
		return new Memento(state);
	}

	public void restoreFromMemento(Object m)
	{
		if (m instanceof Memento)
		{
			Memento memento = (Memento) m;
			state = memento.getSavedState();
			System.out.println("Créateur : Etat aprés restauration : " + state);
		}
	}

	private static class Memento
	{
		private String state;

		public Memento(String stateToSave)
		{
			//Cloner stateToSave dans state
			//S'il s'agissait d'un objet clonable, on utiliserait state = stateToSave.clone();
			//Ici on réalise le clonage d'une faéon particuliére liée aux String :
			state = new String(stateToSave); 
		}

		public String getSavedState()
		{
			return state;
		}
	}
}