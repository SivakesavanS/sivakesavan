package assignment2;

public class AdditionOfOddIndexNum {
    void add(int a[]) {
    	int b=0;
    	for(int i=0;i<a.length;i++) {
    		if(i%2!=0) {
    			b=b+a[i];
    		}
    	}
    	System.out.println(b);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k[]= {1,2,3,4,5,6,7,8};
		AdditionOfOddIndexNum s=new AdditionOfOddIndexNum();
		s.add(k);
		
	}

}
