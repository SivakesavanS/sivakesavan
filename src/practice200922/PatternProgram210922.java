package practice200922;

public class PatternProgram210922 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5, s = n;
		for (int i = 1; i <= n; i++) {
			for (int j = i; j < n; j++) {
				if (i == 1 || j == 1) {
					System.out.print(j + " ");
				} else {
					System.out.print(" ");
				}
				// System.out.print(j + " ");

			}
			for (int j = s; j > n - i; j--) {
				// System.out.print(j + "A");

				if (i == 5 || j == 5) {
					System.out.print(j + " ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
