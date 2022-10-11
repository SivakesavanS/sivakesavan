package assignment2;

public class PlacingGivenNumberInLastIndexOfGivenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  int a[]= {1,2,3,4,5};
//  int b=6;
//  for(int  i=0;i<a.length;i++) {
//	  a[a.length-1]=b;
//	  System.out.println(a[i]);
//  }
  int a[]= {1,2,3,4,5};
  int b[]=new int [a.length+1];
  for(int i=0;i<a.length;i++) {
	  b[i]=a[i];
  } b[b.length-1]=8;
  for(int i:b) {
	  System.out.println(i);
  }
	}

}
