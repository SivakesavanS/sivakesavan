package practice230922;

public class PatternStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n=5;
      for(int i=1;i<=n;i++) {
    	  for(int j=1;j<=n;j++) {
    		  if(i==j||j==n-i+1||i==n/2+1||j==n/2+1) {
    		//  if(i==1||j==i+2||i==3||j==n||i==n||j==3){
    			  System.out.print("*");
    		  }
    		  else {
    			  System.out.print(" ");
    		  }
    	  }
    	  System.out.println();
      }
	}

}
