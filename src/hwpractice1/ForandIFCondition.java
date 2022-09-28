package hwpractice1;
import java.util.Scanner;
public class ForandIFCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n;
Scanner input=new Scanner(System.in);
System.out.print("Enter the Number");
n=input.nextInt();
if(n%3==0 && n%5==0)
{
System.out.print("bing bang");
}
else if(n%3==0) {
System.out.print("bing");
}else if(n%5==0) {
	System.out.print("bang");}

else 
{
	System.out.print(n);	
}
	}

}
