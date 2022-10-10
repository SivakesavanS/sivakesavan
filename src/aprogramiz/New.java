package aprogramiz;
import java.util.Scanner;
public class New {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  int a=42;
//  int b=100;
//  int c=125;
//  System.out.println(a);
//  System.out.println(b);
//  System.out.println(c);
		Scanner scan = new Scanner(System.in);
	       
        int i = scan.nextInt();
        double d = scan.nextDouble();
//        scan.nextLine();
//       String s = scan.nextLine();

        String s = scan.next();
       
     //  scan.close();
       // Write your code here.

       System.out.println("String : " + s);
       System.out.println("Double: " + d);
       System.out.println("Int: " + i);
	}

}
