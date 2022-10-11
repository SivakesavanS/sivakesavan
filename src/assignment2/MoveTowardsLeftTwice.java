package assignment2;

public class MoveTowardsLeftTwice {
 void twoleft(int a[]) {
	 int b=a[0];
	 for(int i=0;i<a.length-1;i++) {
		 a[i]=a[i+1];
	 
	 }
	 a[a.length-1]=b;
//	 for(int j=0;j<a.length;j++) {
//		// System.out.print	(a[j]);
//	 }
	 int c=a[0];
	 for(int i=0;i<a.length-1;i++) {
		 a[i]=a[i+1];
	 
	 }
	 a[a.length-1]=c;
	 for(int j=0;j<a.length;j++) {
		 System.out.print	(a[j]);
	 }
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k[]= {1,2,3,4,5};
		MoveTowardsLeftTwice s=new MoveTowardsLeftTwice();
		 s.twoleft(k);
		
	}

}
