package practice160922;
import java.util.Scanner;
public class Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		

		        Scanner reader = new Scanner(System.in);

		        System.out.print("Enter a number: ");
		        int num = reader.nextInt();

		        String a = (num % 2 == 0) ? "e" : "o";

		        System.out.println(num + " is " + a);

		    }
		
	}


