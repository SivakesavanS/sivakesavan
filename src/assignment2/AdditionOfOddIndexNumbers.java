package assignment2;
import java.util.Scanner;
public class AdditionOfOddIndexNumbers {
  void input() {
	  int a[]=new int [5];
	  Scanner s=new Scanner(System.in);
	  for(int i=0;i<a.length;i++) {
		  System.out.println("Enter Your Number");
		  a[i]=s.nextInt();
		  System.out.println(a[i]);
	  }
	  
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdditionOfOddIndexNumbers s=new AdditionOfOddIndexNumbers();
		 s.input();
		
	}

}
