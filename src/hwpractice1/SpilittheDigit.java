package hwpractice1;

public class SpilittheDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*int num=7589;
int sum;
while(num>0) {
	int r=num%10;
	System.out.print(r);
	num=num/10;
	*/

	int num=7589,sum=0;
	while(num>0) {
		int r=num%10;
		sum=sum+r;
		num=num/10;
	}
	System.out.print(sum);
	}

}
