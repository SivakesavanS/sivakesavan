package practice160922;

public class FibonnaciSeriesTwoVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int f=-1;
      int s=1;
      for(int i=0;i<7;i++) {
    	  System.out.print(f+s);
    	  s=f+s;
    	  f=s-f;
      }
	}

}
