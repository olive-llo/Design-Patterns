package com.qualiformed.designpattern.pattern.comportement.mediateur;

//Mediateur abstrait
public interface IMediateur
{
	public void book();

	public void view();

	public void search();

	public void registerView(BtnView v);

	public void registerSearch(BtnSearch s);

	public void registerBook(BtnBook b);

	public void registerDisplay(LblDisplay d);
}