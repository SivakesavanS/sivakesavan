package assignment2;

public class TwoBigNo {
 void big(int a[]) {
	 int b=a[0];
	 for(int i=0;i<a.length;i++) {
		 if(a[i]>b) {
			 b=a[i];
		 }
	 }
	 System.out.println(b);
	 int c=a[0];
	for(int j=0;j<a.length;j++) {
		if(a[j]>c&&a[j]!=b) {
			 c=a[j];
		}
	}
	System.out.println(c);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k[]= {1,2,3,-14,5};
		TwoBigNo s=new TwoBigNo();
		    s.big(k);
	}

}
