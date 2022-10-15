package polymarphism;

public class Terinary {
	static void max(int a,int b) {
		int c;
		c=a>b?a:b;
		System.out.println(c);
	}
	static void max(int a,int b,int c) {
		int d;
		int e;
		d=a>b?a:b;
		e=d>c?d:c;
		System.out.println(e);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Terinary.max(2,5);
		Terinary.max(2,5,10);
	}

}
