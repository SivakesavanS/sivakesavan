package assignment2;

public class PrintInReversOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int a[]= {1,2,3,4,5};
  for(int i=0;i<=a.length;i++) {
	  System.out.println(a[i]);
  }
  System.out.println();
  for(int j=a.length-1;j>=0;j--) {  
	 System.out.println(a[j]);

  }
	}

}
