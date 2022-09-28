package hwPractice;
import java.util.Scanner;
public class WhileLoops1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=0;
int n;
Scanner  input=new Scanner(System.in);
System.out.print("enter num");
n=input.nextInt();
while(i<=n) {
	System.out.print("*");
	i++;
}

	}

}
