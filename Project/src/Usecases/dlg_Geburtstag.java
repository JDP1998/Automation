package Usecases;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.GregorianCalendar;

public class dlg_Geburtstag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		ZoneId z = ZoneId.systemDefault();
		LocalDate local = d.toInstant().atZone(z).toLocalDate();
		int year = local.getYear();
		GregorianCalendar heute = new GregorianCalendar();
		GregorianCalendar weihnachten = new GregorianCalendar(year, 04, 13);
		long differenz = weihnachten.getTimeInMillis()-heute.getTimeInMillis();
		int tage;
		tage=(int)(differenz/(1000*60*60*24))-30;
		if(tage<0) {
			tage=365+tage;
		}
		System.out.println("Es sind noch "+tage+" Tage bis zu meinem Geburtstag.");

	}

}
