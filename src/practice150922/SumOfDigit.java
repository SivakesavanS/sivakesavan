package practice150922;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a=12345678;
      int sum=0,b;
      for(;a>0;) {
    	  b=a%10;
    	  sum=sum+b;
    	  a=a/10; 
    	  
    	  System.out.println(sum);
      }
      
      
    	      	
      
     
	}

}
