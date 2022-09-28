package practice130922;

public class ArrayPrac3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a[]= {1,25,4,5,6};
     int b;
     for (int i=0;i<a.length-1;i++) {
    	 b=a[i]-a[i+1];
    	 System.out.println(b);
     }
	}}
/*
 * 1-25
 * 25-4
 * 4-5
 * 5-6
 * 
 * a[0]-a[1]
 * a[1]-a[2]
 * 
 * a[i]-a[i+1]
 * i=0
 * a[0]-a[0+1]
 * a[0]-a[1]
 * 1-25
 * -24
 * 
 * 
 * i=1
 * a[1]-a[1+1]
 * a[1]-a[2]
 * 25-4
 * 21
 * 
 * i<5-1
 * i<4
 * 
 * 
 */


