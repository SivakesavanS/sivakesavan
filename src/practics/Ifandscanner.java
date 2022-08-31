package practics;
import java.util.Scanner;
public class Ifandscanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int pen=15;
int specialpen=25;
int cost;
System.out.println("enter value " );
Scanner input=new Scanner(System.in);
cost=input.nextInt();

if(cost>specialpen) {
System.out.println("you can by the special pen");
}
else if(cost>pen) {
	System.out.println("you can by the pen");
}
else {
	System.out.println("you have less money");
}
	}

}
