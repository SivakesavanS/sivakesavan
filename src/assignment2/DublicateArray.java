package assignment2;

public class DublicateArray {

		public static void main(String[] args) {
			int a[] = { 1, 2, 2, 3, 4, 4, 5, 6, 7, 8, 9,3,2,2};
			int i = 0;
			int j = 0;
			int max1 = a[0];
			int count = 0;
			for (i = 0; i < a.length; i++) {
				if (a[i] > max1)
					max1 = a[i];
			}
			int b[] = new int[max1 + 1];
			for (i = 0; i < a.length; i++) {
				int ele= a[i];
				b[ele]++;
			}
			
			for (j = 0; j < b.length; j++) {
				System.out.println(j +"=>"+b[j]);
			}
   
		}}