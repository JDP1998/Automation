package Usecases;

public class dlg_RandomWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int begin,random,counter=0;
		String word="";
		begin = (int)(Math.random()*26)+65;
		char letter;
		letter = (char) begin;
		word=word+letter;
        while(counter<=10) {
        	random = (int)(Math.random()*26)+97;
        	letter = (char) random;
        	word=word+letter;
        	counter++;
        }
        System.out.println("Das Zufallswort ist: "+word);
	}

}
