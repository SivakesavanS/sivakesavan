package assignment;

public class SmallestDivisorOfAnInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=50;
int i=2,sum=0;

for( i=2;i<n;i++) {
	if(n%i==0) {
    System.out.println(i);
		break;
		//sum=i;
	}
}
//System.out.println(sum);
	}

}
