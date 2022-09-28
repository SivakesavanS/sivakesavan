package assignment;

public class SpyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n=1124;
      int a=0;
      int sum=0,b=1;
      while(n>0) {
    	 a=n%10;
    	 b=b*a;
    	 sum=sum+a;
    	 n=n/10;
      }if(b==sum) {
      System.out.print("Spy Number");
	}else {
		System.out.print("Not Spy Number");
	}
	}
}
