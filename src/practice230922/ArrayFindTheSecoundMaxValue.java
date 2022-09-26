package practice2230922;

public class ArrayFindTheSecoundMaxValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[]= {1,2,3,44,5,6,7,38};
		    int max=a[0];
		    int b=0;
		    for(int i=0;i<a.length;i++) {
		    	if(a[i]>max) {
		    		max=a[i];
		    		b=i;
		    	}
		    }
		    
		    System.out.println(b +" = "+max);
		    int sec=a[0];
		    int c=0;
		    for(int i=0;i<a.length;i++) {
		    	if(a[i]>sec && a[i] !=max) {
		    		sec=a[i];
		    		c=i;
		    	}
		    }
		    System.out.print(c +" = "+sec);
	}

}
