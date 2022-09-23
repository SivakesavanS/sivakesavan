package practice220922;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a[]= {1,2,3,4,5};
     int b;
      for(int k=1;k<=6;k++) { 
     b=a[a.length-1];
     for(int i=a.length-1;i>0;i--) {
    	 a[i]=a[i-1];
     }

  a[0]=b;
  }
   
     for(int i=0;i<a.length;i++) {
    	
   	System.out.println(a[i]);
     }
	}

}
