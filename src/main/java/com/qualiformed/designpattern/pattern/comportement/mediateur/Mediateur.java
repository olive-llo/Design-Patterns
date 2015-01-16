package com.qualiformed.designpattern.pattern.comportement.mediateur;

//Concrete mediator
public class Mediateur implements IMediateur
{

	BtnView btnView;
	BtnSearch btnSearch;
	BtnBook btnBook;
	LblDisplay show;

	// ....
	public void registerView(BtnView v)
	{
		btnView = v;
	}

	public void registerSearch(BtnSearch s)
	{
		btnSearch = s;
	}

	public void registerBook(BtnBook b)
	{
		btnBook = b;
	}

	public void registerDisplay(LblDisplay d)
	{
		show = d;
	}

	public void book()
	{
		btnBook.setEnabled(false);
		btnView.setEnabled(true);
		btnSearch.setEnabled(true);
		show.setText("Lecture en cours...");
	}

	public void view()
	{
		btnView.setEnabled(false);
		btnSearch.setEnabled(true);
		btnBook.setEnabled(true);
		show.setText("Visionnage en cours...");
	}

	public void search()
	{
		btnSearch.setEnabled(false);
		btnView.setEnabled(true);
		btnBook.setEnabled(true);
		show.setText("Recherche en cours...");
	}

}