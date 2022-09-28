package assignment;

public class Palindrome25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int a=2442;
   int sum=0,b;
   int tem=a;
   while(a>0) {
	   b=a%10;
	   sum=(sum*10)+b; 
	   a=a/10;	  
   }
   if(sum==tem) {
	   System.out.print("Palindrome");
   }else {
	   System.out.print("not a Palindrome");
   }
	}

}
