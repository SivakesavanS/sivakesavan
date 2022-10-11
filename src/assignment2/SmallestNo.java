package assignment2;

public class SmallestNo {
   int small(int a[]) {
	   int b=a[0];
	   for(int i=0;i<a.length;i++) {
		  if(a[i]<b) {
			  b=a[i];
		  }
	   }
	   return b;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k[]= {11,22,13,44,5};
		SmallestNo s=new SmallestNo();
		int x=s.small(k);
		System.out.println(x);
	}

}
