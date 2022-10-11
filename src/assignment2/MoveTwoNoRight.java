package assignment2;

public class MoveTwoNoRight {
     void move(int a[]) {
    	 int b=a[a.length-1];
    		for(int i=a.length-1;i>0;i--) {  			
    			a[i]=a[i-1];
    		}
    		
   		a[0]=b;
//    		for(int j=0;j<a.length;j++) {
//    			 System.out.print	(a[j]);
//    		}
    		int c=a[a.length-1];
    		for(int i=a.length-1;i>0;i--) {
    			
    			a[i]=a[i-1];
    			//System.out.print(a[l]);
    		}
    		
    		a[0]=c;
    		for(int j=0;j<a.length;j++) {
    			 System.out.print	(a[j]);
    		}
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k[]= {1,2,3,4,5};
		MoveTwoNoRight s=new MoveTwoNoRight();
		s.move(k);
	}

}
