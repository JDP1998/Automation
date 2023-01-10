package Usecases;

public class Random_Würfel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,zufall,einer = 0,zweier = 0,dreier = 0,vierer = 0,fünfer = 0,sechser = 0;
		for(i=0;i<100;i++)
		{
			zufall=(int)(Math.random()*6)+1;
			if(zufall==1)
			{
				einer++;
			}
			if(zufall==2)
			{
				zweier++;
			}
			if(zufall==3)
			{
				dreier++;
			}
			if(zufall==4)
			{
				vierer++;
			}
			if(zufall==5)
			{
				fünfer++;
			}
			if(zufall==6)
			{
				sechser++;
			}
		}
		System.out.println("Einser  : "+einer);
		System.out.println("Zweier  : "+zweier);
		System.out.println("Dreier  : "+dreier);
		System.out.println("Vierer  : "+vierer);
		System.out.println("Fünfer  : "+fünfer);
		System.out.println("Sechser : "+sechser);

	}

}
