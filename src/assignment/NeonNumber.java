package assignment;

public class NeonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int n=9;
   int k=n;
   int a=0,b,sum=0;
   
	   a=n*n;
	while(a>0) {
	   b=a%10;
	 
	   a=a/10;
	   sum=sum+b;
   }
   if(sum==k) {
	   System.out.print("Neon");
   }else {
	   System.out.print("Not Neon");   
   }
	}

}
