package Usecases;



public class dlg_Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start,end,time;
		start=System.currentTimeMillis();
		int i=0,z=60;
		for(i=0;i<=z;i++) {
			System.out.println("Fibunacci von "+i+" ist "+Fibunacci(i));
		}
		end=System.currentTimeMillis();
		time=end-start;
		time=time/1000;
		time=time/60;
		System.out.println("Es hat "+time+" Minuten gedauert.");

	}
	private static int Fibunacci(int i) {
		// TODO Auto-generated method stub
		if(i<=1) {
			return 1;
		}
		else {
			return Fibunacci(i-1)+Fibunacci(i-2);
		}
	}

}
