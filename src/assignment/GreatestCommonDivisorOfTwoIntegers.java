package assignment;

public class GreatestCommonDivisorOfTwoIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n1=15,n2=30,a=0;
    for(int i=2;i<=n1&&i<=n2;i++) {
    	if(n1%i==0&&n2%i==0) {
    		a=i;
    		//System.out.print(i);
    		//break;
    	}
    }
    System.out.print(a);
	}

}
