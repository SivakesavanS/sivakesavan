package mFileIo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWritter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
File s=new File("/home/siva/Music/siva.txt");
//System.out.println(s.createNewFile());
s.createNewFile();
FileWriter k=new FileWriter(s);


//k.write("siva");				
//k.write("\n\tkesavan");
//k.write("\n\tmani");
//k.write("\n\t\tdeva");
//k.flush();
//k.close();
//BufferedWriter l=new BufferedWriter(k );
//
//l.write("deva");
//l.flush();
//l.close();
PrintWriter a=new PrintWriter(k );

a.write("sivais a good boy. kesavan deva mani");
a.flush();
a.close();









	}

}
