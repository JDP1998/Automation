package Usecases;

import java.util.Scanner;

public class dlg_Threads {
	public static void main (String[]args)
	{
		Scanner s = new Scanner(System.in);
		int i, anz;
		System.out.println("Wie viele Prozesse sollen laufen?");
		i = 0;
		anz = s.nextInt();
		while (i <= anz) {
			Prozess p = new Prozess();
			p.name = i;
			Thread t = new Thread(p);
			t.start();
			i++;
		}
	}

}
