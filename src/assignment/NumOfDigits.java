package assignment;

public class NumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=12351;
        int i=0;
        int a;
     while(n>0) {
  	   a=n%10;
  	   i++;
  	   n=n/10;
     }
	System.out.print(i);
	}

}
