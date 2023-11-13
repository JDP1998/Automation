package Usecases;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class dlg_Silvester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = Calendar.getInstance().get(Calendar.YEAR);
		GregorianCalendar heute = new GregorianCalendar();
		GregorianCalendar weihnachten = new GregorianCalendar(year, 12, 31);
		long differenz = weihnachten.getTimeInMillis() - heute.getTimeInMillis();
		int tage;
		tage = (int) (differenz / (1000 * 60 * 60 * 24)) - 30;
		if (tage == 365) {
			System.out.println("Frohes Neues");
		} else {
			System.out.println("Es sind noch " + tage + " Tage bis Silvester");
		}

	}

}