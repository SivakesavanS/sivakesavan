package practice160922;

public class FibonnaciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int f=-1;
    int s=1;
    int  t=0;
    for(int i=0;i<=7;i++) {
    	t=f+s;
    	System.out.print(t);
    	f=s;
    	s=t;
    			
    }
	}

}
