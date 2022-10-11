package assignment2;

public class TwoSmallNo {
		void small(int a[]) {
			int b = a[0];// 1;
			int d=0;
		
			for (int i = 0; i < a.length; i++) {
				if (a[i] > b) {
					b = a[i];	
				}
			}
			int e = a[0];// 1;
	
			for (int i = 0; i < a.length; i++) {
				if (a[i] < e) {
					e = a[i];
					d=i;
				}
			}
			System.out.println(e);
			
			int c =b;
			for (int j = 0; j < a.length; j++) {
				if (a[j] < c && a[j] != e) {
					c = a[j];			
				}
			}System.out.println(c);		
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int k[] = {-11, 2, 3,4,2,122, -5 };
			TwoSmallNo s = new TwoSmallNo();
			s.small(k);
	
		}

}
