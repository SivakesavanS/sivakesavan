package hwPractice;
import java.util.Scanner;
public class JumpStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double n,sum=0.00;
Scanner input=new Scanner(System.in);
System.out.print("enter the number");

while(true) {
	n=input.nextDouble();
	if (n<0.00) {
		break;
	}
	sum=sum+n;
}
System.out.print(sum);




}

}
