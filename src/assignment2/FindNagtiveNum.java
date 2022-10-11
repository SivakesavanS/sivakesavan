package assignment2;

public class FindNagtiveNum {
 void negative(int a[]) {
	 
	 for(int i=0;i<a.length;i++) {
		 if(a[i]<0) {
			 System.out.println(a[i]);
		 }
	 }
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int k[]= {1,2,-3,4,-5,-6};
       FindNagtiveNum s=new FindNagtiveNum();
       s.negative(k);
	}

}
