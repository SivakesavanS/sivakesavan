package assignment;

public class NumberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int n=123423;
   int i=0;
    while(n>0) {
    	int a=n%10;
    	n=n/10;
    	i++;
    }
    System.out.print(i);
	}

}
