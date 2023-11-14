package Usecases;

public class Prozess implements Runnable {
	int name;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i=0;
		for(i=0;i<=100;i++) {
			System.out.println("Thread "+name+" zählt "+i);
		}
	}
	

}
