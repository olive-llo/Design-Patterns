package com.qualiformed.designpattern.pattern.structure.facade;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateFacile
{
	GregorianCalendar gcal;

	public DateFacile(String isodate_ymd)
	{
		String[] a = isodate_ymd.split("-");
		gcal = new GregorianCalendar(Integer.parseInt(a[0]),
				Integer.parseInt(a[1]) - 1,
				Integer.parseInt(a[2]));
	}

	public void addDays(int days)
	{
		gcal.add(Calendar.DAY_OF_MONTH, days);
	}

	public String toString()
	{
		return String.format("%1$tY-%1$tm-%1$td", gcal);
	}
}
