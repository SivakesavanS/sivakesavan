package practice130922;

public class ArrayBig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a[]=new int[3];
     a[0]=5;
     a[1]=6;
     a[2]=7;
     if(a[0]>a[1]&&a[0]>a[2]) {
    	 System.out.print(a[0]);
     }
     if(a[1]>a[2]) {
    	 System.out.print(a[1]);
     }
     if(a[2]>a[0]&&a[2]>a[1]) {
    	 System.out.print(a[2]);
     }	 
	}

}
