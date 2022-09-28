package assignment;
import java.util.Scanner;
public class PrintAdd16 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter n num");
		int num=input.nextInt();
		int sum=0;
		for(int i=0;i<=num;i++) {
			sum=sum+i;
			
		}
		System.out.print(sum);
	}

}
