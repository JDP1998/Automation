package Usecases;

public class Weihnachtsbaum {

	public static void main(String[] args) {
		int reihen,fallnr = 0,akt_anz_sterne=1,akt_anz_blanks,anz_sterne=1,anz_blanks=4;
		reihen=5;
		akt_anz_blanks=reihen-1;
		String druckzeile = "";
		while(reihen>0)
		{
		druckzeile="";
		anz_blanks=akt_anz_blanks;
		anz_sterne=akt_anz_sterne;
		while(anz_blanks>0)
		{
			druckzeile=druckzeile+" ";
			anz_blanks--;
		}
		while(anz_sterne>0)
		{
			druckzeile=druckzeile+"*";
			anz_sterne--;
		}
		System.out.println(druckzeile);
		akt_anz_sterne=akt_anz_sterne+2;
		akt_anz_blanks--;
		reihen--;
		}
		reihen=2;
		while(reihen>0)
		{
			druckzeile="";
			anz_blanks=3;
			anz_sterne=3;
			while(anz_blanks>0)
			{
				druckzeile=druckzeile+" ";
				anz_blanks--;
			}
			while(anz_sterne>0)
			{
				druckzeile=druckzeile+"*";
				anz_sterne--;
			}
			System.out.println(druckzeile);
			reihen--;
		}

	}

}
