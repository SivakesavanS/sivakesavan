package practice090922;

public class FiboncciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a,b=2,c=-1;
     for(int i=1;i<=2;i++) {
    	 a=b+c;
    	 System.out.println(a);
    	 b=c;
    	 c=a;
     }
	}

}
