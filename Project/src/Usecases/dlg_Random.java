package Usecases;

public class dlg_Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 long counter=0,start,end,time;
         int zahl=1000001,zufall;
         start=System.currentTimeMillis();
         zufall=(int)(Math.random()*1000000)+1;
         while (zahl!=zufall) {
        	 zahl=(int)(Math.random()*1000000)+1;
        	 System.out.println("Die Zufallszahl ist: "+zahl);
        	 counter++;
         }
         end=System.currentTimeMillis();
         time=end-start;
         System.out.println("Es ist beendet. Es hat "+time+" Milliskeunden gedauert.");
         System.out.println("Die Schleife musste "+counter+ " mal durchlaufen werden.");
	}

}
