package practice2230922;

public class ArrayFindMaxValuePosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[]= {1,99,3,4,5,6,790,81};
		    int max=a[0];
		    int b=0;
		    for(int i=0;i<a.length;i++) {
		    	if(a[i]>max) {
		    		max=a[i];
		    		b=i;
		    	}
		    }
		    System.out.print(b +" = "+ max);
	}

}
