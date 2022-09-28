package assignment;

public class LeastCommonMultipleOfGivenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n1=25,n2=3;
      int a=0;
		for(int i=1;i<=n1&&i<=n2;i++) {
			if(n1%i==0&&n2%i==0) {
				a=i;
			}
			}
			int b=(n1*n2)/a;
			System.out.print(b);
		
	
	}

}
