package mFileIo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileReader1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File s=new File("/home/siva/Music/siva.txt");
		//System.out.println(s.createNewFile());
		s.createNewFile();
		FileReader k=new FileReader(s);
		 BufferedReader n = new BufferedReader(k);
		 String output = n.readLine(); 
		 while(output!=null)
		 {
			 //int m=Integer.parseInt(output);
			 
		  System.out.println(output);
		  output = n.readLine();
		 }
		 n.close();
//		 int r = k.read();
//		 //String output=k.ReadLine(s);
//		 k.read
//		 int wordCount = 1;
//		 int sentenceCount = 0; 
//		 while(r!=-1) {
//		 System.out.print((char)r);
//		 if((char)r == ' ')
//		  wordCount++; 
//		 if((char)r =='.')
//		  sentenceCount++;
//		 r = k.read();
//		 }
//		 System.out.println("Word Count is "+ wordCount);
//		 System.out.println("Sentence Count is "+ sentenceCount);
//		
		

	}

	

}
