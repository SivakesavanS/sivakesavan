package hwPractice;

public class NestedLoops1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	for(int i=1;i<=5;i++) 
	     {
	    	 for(int j=1;j<=i;j++) 
	    	 {
	    		
	    		 System.out.print("*");
	    	 }
	    	 System.out.print("\n");
	    	 if(i==5/2+1||j==5/2+1)-----> +
	    	 if(i==j||i+j==5+1) --------> *
		 }*/
		for(int i=1;i<=5;i++){	 
	     {
	    	 for(int j=1;j<=5;j++) 
	    	 {
	    		if(i==1||j==1||i==5||j==5)
	    		 System.out.print("* ");
	    		else
	    		System.out.print("  ");	
	    			
	    	 }
	    	 System.out.print("\n");
		 }
	}
	}
}
