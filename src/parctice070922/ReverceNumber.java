package parctice070922;

public class ReverceNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n=9857,rev=0,r;
      while(n>0) {
    	  r=n%10;
    	  rev=(rev*10)+r;
    	  n=n/10;
      }System.out.print(rev);

	}
	
}
