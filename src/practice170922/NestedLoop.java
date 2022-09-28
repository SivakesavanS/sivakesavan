package practice170922;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   /*  int n=5;
     for(int i=0;i<=n;i++) {
    	 System.out.print("* ");
     }
     System.out.println();
	
	for(int i=0;i<=n;i++) {
   	 System.out.print("* ");
    }
    */
     int n=5;
     for(int j=0;j<n;j++) {
    	 for(int i=0;i<n;i++) {
    		 System.out.print("* ");
    	 }
    	 System.out.println();
     }
}
}