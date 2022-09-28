package assignment;

public class PrimeNosInAFibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int f=-1;
     int s=1;
     int t=0;
     int k=0;
     int n=10;
     for(int i=1;i<=7;i++) {
    	 t=f+s;
	//System.out.print(t);
    	 f=s;
    	 s=t;
     for(int j=1;j<=t;j++) {			
    	 if(t%j==0) {
    		 k++;
    	 }
    	 }
     if(k==2) {
    		 System.out.println(t);
    	 }k=0;
    	 
     }
    
}
}