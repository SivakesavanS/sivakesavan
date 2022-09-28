package practice090922;

public class PAtternPrint {

	public static void main(String[] args) {
		int a=5;
	// TODO Auto-generated method stub
for (int i=1;i<=a;i++) {
	for(int  j=a-i;j>=0;j--) {
		System.out.print(" *");
	}
	System.out.println();
}
	}

}
