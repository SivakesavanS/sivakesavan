package practice160922;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2, b = 0;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				b = b + 1;

			}
		}
			if (b > 0) {
				System.out.print("Not a Prime");

			} else {
				System.out.print(n+" Prime");

			
		}

	}

}
