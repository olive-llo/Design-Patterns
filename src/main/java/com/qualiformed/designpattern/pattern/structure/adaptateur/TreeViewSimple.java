package com.qualiformed.designpattern.pattern.structure.adaptateur;

public class TreeViewSimple
{
	private String representation;

	public TreeViewSimple(String representationSimple)
	{
		this.setRepresentation(representationSimple);
	}

	public String getRepresentation()
	{
		return representation;
	}

	public void setRepresentation(String representation)
	{
		this.representation = representation;
	}
}
