package hwPractice;
import java.util.Scanner;
public class Switchstetment {
	public static void main(String[] args) {
		int a,b;
		Scanner input=new Scanner (System.in);
		System.out.print("Enter a first number");
		a=input.nextInt();
		System.out.print("Enter a secount number");
		b=input.nextInt();	
		char operator;
		System.out.print("Enter a operator +,-,%./,*");
		operator=input.next().charAt(0);
		switch (operator)
		{
		case ' +' :
		System.out.println(a+b);
		break;
		case ' - ':
			System.out.print(a-b);
		case ' % ':
			System.out.print(a%b);
		case ' / ':
			System.out.print(a/b);
		default:
			System.out.print("your num is wrong");
		}
		
		
		
	}
}
