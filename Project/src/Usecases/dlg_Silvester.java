package Usecases;

import java.util.GregorianCalendar;

public class dlg_Silvester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar heute = new GregorianCalendar();
		GregorianCalendar weihnachten = new GregorianCalendar(2022, 12, 31);
		long differenz = weihnachten.getTimeInMillis()-heute.getTimeInMillis();
		int tage;
		tage=(int)(differenz/(1000*60*60*24))-30;
		System.out.println("Es sind noch "+tage+" Tage bis Silvester");

	}

}