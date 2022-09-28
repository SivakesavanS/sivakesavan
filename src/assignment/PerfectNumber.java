package assignment;

public class PerfectNumber {

	public static void main(String[] args) {
		int n=6;
		int b=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				b=b+i;
			}
		}
		System.out.println(b);
		if(n==b) {
			System.out.print("Perfect Number");
		}
		else {
			System.out.print("Not a Perfect Number");
		}
	}
}

