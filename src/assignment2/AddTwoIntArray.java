package assignment2;

public class AddTwoIntArray {
 void Add(int a[],int x[]) {
	 int b[]=new int [a.length];
	 for(int i=0;i<a.length;i++) {
		 b[i]=a[i]+x[i];
		 System.out.println(b[i]);
	 }
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k[]= {1,2,3,4,5};
		int h[]= {5,10,15,20,25};
		AddTwoIntArray s=new AddTwoIntArray();
		s.Add(k, h);
		
		
	}

}
