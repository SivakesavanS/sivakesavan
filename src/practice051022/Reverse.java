package practice051022;

public class Reverse {
    void rev(int a[]) {
    	for(int i=a.length-1;i>=0;i--) {
    		System.out.println(a[i]);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k[]= {1,2,3,4,5};
		Reverse s=new Reverse ();
		   s.rev(k);
		//int x=s.rev(k);
		//System.out.println(x);
	}

}
