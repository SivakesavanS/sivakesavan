package hwPractice;
import java.util.Scanner;
public class Switchstatif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=2;
Scanner input=new Scanner(System.in);
System.out.print("Enter a number");
a=input.nextInt();

if(a==1&&a<=1)
System.out.print("Monday");
else if (a==2)
	System.out.print("wednessday");
	else if (a==3)
		System.out.print("Thersday");
	else if (a==4)
		System.out.print("friday");
	else if (a==5)
		System.out.print("Satureday");
	else if (a==6)
		System.out.print("sunday");
	else 
		System.out.print("entered wrong date");
	}

}
