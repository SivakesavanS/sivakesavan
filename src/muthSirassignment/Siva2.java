package muthSirassignment;

public class Siva2 {
	void siva() {
		int a=5;
		int b=6;
		int c=7;
		int d=8;
		a=a+b+c;
		b=a-b-c;
		c=a-b-c;
		a=a-b-c;
		b=b+c+d;
		c=b-c-d;
		d=b-c-d;
		b=b-c-d;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Siva2 s=new Siva2();
		s.siva();
	}

}
