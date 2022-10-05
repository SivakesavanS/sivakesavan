package practice051022;

public class ArrayFindMaxValue {
      int max (int a, int b, int c) {
    	  if(a>=b&&a>=c) {
    		  return a;
    	  }
    	  else if(b>=c) {
    		  return b;
    	  }
    	  else {
    		  return c;
    	  }
    	  
    	  
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayFindMaxValue s=new ArrayFindMaxValue();
		int x=s.max(10,15,23);
		System.out.println(x);
		//ArrayFindMaxValue s1=new ArrayFindMaxValue();
		int x1=s.max(11,33,66);
		System.out.println(x1);
	}

}
