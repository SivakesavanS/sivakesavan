package assignment;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n=1011;
    int a=0;
	int b;
    int power=0;
    while(n>0) {
    	b=n%10;
    a+=b*Math.pow(2, power);
    n=n/10;
    power++;
    }
    System.out.print(a);
	}

}
