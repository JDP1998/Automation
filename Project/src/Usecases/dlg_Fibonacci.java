package Usecases;



public class dlg_Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start,end,time;
		start=System.currentTimeMillis();
		long i=0,z=57;
		for(i=0;i<=z;i++) {
			System.out.println("Fibonacci von "+i+" ist "+Fibonacci(i));
		}
		end=System.currentTimeMillis();
		time=end-start;
		time=time/1000;
		time=time/60;
		System.out.println("Es hat "+time+" Minuten gedauert.");

	}
	private static long Fibonacci(long i) {
		// TODO Auto-generated method stub
		if(i<=1) {
			return 1;
		}
		else {
			return Fibonacci(i-1)+Fibonacci(i-2);
		}
	}

}
