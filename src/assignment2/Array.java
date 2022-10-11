package assignment2;
 
import java.util.Scanner;

public class Array {
   void scan(int a[]) {
	  for(int s:a) {
		  System.out.println(s);
	  }
	   
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array s1=new Array();
		
		 int a[]=new int [5];
		  Scanner s=new Scanner(System.in);
		  for(int i=0;i<a.length;i++) {
			  System.out.print("Enter Your Number");
			  a[i]=s.nextInt();
	}
		  s1.scan(a);
}
}
