package assignment2;

public class CopyNegativeNum {
	void negative(int a[]) {
		 int b[]=new int [a.length];
		 for(int i=0;i<a.length;i++) {
			 if(a[i]<0) {
				 b[i]=a[i];
				 System.out.println(b[i]);
			 }
		 }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k[]= {1,2,3,4,-5,-6,-11,-22};
		CopyNegativeNum s=new CopyNegativeNum	();
	       s.negative(k);
	}

}
