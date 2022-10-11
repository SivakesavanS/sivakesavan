package assignment2;

import java.util.Arrays;

public class AllElementsTowardsLeft {
 void move(int a[]) {
	int b=a[0];
	 for(int i=0;i<a.length-1;i++) {
		 a[i]=a[i+1];
	//	 System.out.print	(a[i]);
	 }
	 a[a.length-1]=b;
	 for(int j=0;j<a.length;j++) {
		 System.out.print	(a[j]);
	 }
	 
	 System.out.println(Arrays.toString(a));
	 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k[]= {1,2,3,4,5};
		AllElementsTowardsLeft s=new AllElementsTowardsLeft();
		s.move(k);
	}

}
