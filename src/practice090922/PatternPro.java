package practice090922;

public class PatternPro {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a=6;
    for(int i=1;i<=5;i++) {
    	for(int j=5-i;j>=0;j--) {
    		System.out.print( "  " );
    	}
    	for(int k=1;k<=i;k++) {
    		System.out.print("* ");}
    	for(int a=1;a<=i;a++) {
    		System.out.print("* ");
    	}
    	System.out.println();
    }
    
    for(int l=1;l<=5;l++) {
     for(int s=1;s<=l;s++ ) {
    	 System.out.print(  "  "); 
     }
     for(int n=5-l;n>=0;n--) {
    	 System.out.print("* ");
     }
     for(int d=5-l;d>=0;d--) {
    	 System.out.print("* ");
     }
     System.out.println();
		
    }
    
    }	
	}


