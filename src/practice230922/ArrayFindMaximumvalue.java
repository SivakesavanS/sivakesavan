package practice230922;

public class ArrayFindMaximumvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]= {1,2,3,4,5,6,7,8};
    int max=a[0];
    for(int i=0;i<a.length;i++) {
    	if(a[i]>max) {
    		max=a[i];
    	}
    }
    System.out.print(max);
	}

}
