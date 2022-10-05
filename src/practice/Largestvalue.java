package practice;

public class Largestvalue {
    int largest (int a[]) {
    	int max=a[0];
    	for(int i=0;i<a.length;i++) {
    		if(a[i]>max) {
    			max=a[i];
    		}
    	}
    	return max;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k[]= {7,4,6,9,7};
		Largestvalue s=new Largestvalue();
		int x=s.largest(k);
		System.out.println(x);
		
		
		
	}

}
