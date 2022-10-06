package practice;

import java.util.Scanner;



public class Oops {
	void scan(int a[]) {
		  for(int s:a) {
			  System.out.println(s);
		  }
		  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Oops s1=new Oops();
		
		 int a[]=new int [5];
		  Scanner s=new Scanner(System.in);
		  for(int i=0;i<a.length;i++) {
			  System.out.print("Enter Your Number");
			  a[i]=s.nextInt();
	}
		  s1.scan(a);
	}

}
