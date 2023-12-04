package Usecases;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.google.common.io.FileBackedOutputStream;

public class dlg_RandomWord {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Date d = new Date();
		DateFormat format = new SimpleDateFormat("DD.MM.YYYY hh:mm:ss");
		File f = new File("Wörter.txt");
		if(f.exists()==false) {
			f.createNewFile();
		}
		int begin,random,counter=0;
		String word="",datum;
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
        datum = format.format(d);
        BufferedWriter bWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f,true)));
        bWriter.write(d+": "+word);
        bWriter.close();
	}

}
