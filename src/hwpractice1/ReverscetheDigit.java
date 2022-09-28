package hwpractice1;

public class ReverscetheDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=7589,t,reverce=0;

while(a>0)
{
	t=a%10;
	
	reverce=(reverce*10)+t;
    a=a/10;
}
System.out.print(reverce);
	}

}
