package hwPractice;
import java.util.Scanner;
public class DowhileLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int n;
		Scanner  input=new Scanner(System.in);
		System.out.print("enter num");
		n=input.nextInt();
		do{
			System.out.print("*");
			i++;
		}
		while(i<=n) ;
	}

}
