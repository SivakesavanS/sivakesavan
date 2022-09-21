package practice200922;

public class Pattern210922 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		int s=0;
		int a=1;
		int k=0;
     for(int i=1;i<=n;i++) {
    	 k++;
    	 for(int j=1;j<=n;j++) {
    		 if(k%2==0) {
    			 System.out.print(s + " ");
    		 }else {
    			 System.out.print(a + " ");
    		 }
    		k++; 
    	 }
    	 System.out.println(); 
     }
	}

}
