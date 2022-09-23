package practice220922;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8,s=n;
	      for(int i=1;i<=n;i++) {
	    	  for(int j=i;j<n;j++) {
	    		if(j==i||i==1)
	    		  System.out.print(j + " ");
	    		 else {
	    			 System.out.print("  ");
	    		 }
	    	  
	    	  }
	    	  for(int j=s;j>n-i;j--) {
	    		  
	    		  if(i==n||i+j==n+1)
	    		  System.out.print(j + " "); 
	    		  else {
	    			  System.out.print("  ");
	    		  }
	        	  
	    	  }
	      
	    	  System.out.println();
	      }	
	}

}
