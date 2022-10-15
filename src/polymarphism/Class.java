package polymarphism;

public class Class {
//	int a;
//	int b;
//	static void siva(int a,int b) {
//		System.out.println(a+b);
//		System.out.println(a*b);
//		System.out.println(a-b);
//		System.out.println(a%b);
//	}
	static void max(int a,int b) {
		if(a>b) {
			System.out.println(a);
		}
		else  {
			System.out.println(b);
		}
	}
	static void max(int a,int b,int c) {
		if(a>b&&a>c) {
			System.out.println(a);
		}
		else if(b>c) {
			System.out.println(b);
		}
		else {
			System.out.println(c);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Class.siva(2,5);
//		Class s=new Class();
//		s.max(15, 10);
//		s.max(5, 30,15);
		Class.max(2,4);
		Class.max(2,4,5);
		
	}

}
